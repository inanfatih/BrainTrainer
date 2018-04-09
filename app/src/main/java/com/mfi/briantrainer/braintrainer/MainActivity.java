package com.mfi.briantrainer.braintrainer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    CountDownTimer countDownTimer;
    TextView question;
    Boolean gameOn;

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    TextView bottomText;

    int correctAnswer;
    int totalAnswer;
    TextView score;
    int buttonTag;

    int maxNumber;
    int numberOne;
    int numberTwo;

    int result;
    int[] results;
    int[] boxOrder;
    int[] boxShown;
    TextView timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = (TextView) findViewById(R.id.question);
        timer = (TextView) findViewById(R.id.timer);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        boxOrder = new int[] {4,4,4,4};
        gameOn = false;
        score = (TextView) findViewById(R.id.score);
        score.setText("0 / 0");
        maxNumber = 25;

        bottomText = (TextView) findViewById(R.id.bottomText);
        bottomText.setText("Click Buttons");

        tagRandomizer();
        buttonValueAssign();
        buttonTagAssign();

        countDownTimer = new CountDownTimer(30000+100, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText((int)millisUntilFinished/1000 + "s");
            }

            @Override
            public void onFinish() {
                bottomText.setText("Score: " + correctAnswer + " / " + totalAnswer);
                gameOn = false;
            }
        };

    }

    private void buttonTagAssign() {

        button0.setTag(boxOrder[0]);
        button1.setTag(boxOrder[1]);
        button2.setTag(boxOrder[2]);
        button3.setTag(boxOrder[3]);

    }

    private int questionGenerator() {
        numberOne = randomNumberGenerator(maxNumber);
        numberTwo = randomNumberGenerator(maxNumber);

        if(gameOn) {
            question.setText(numberOne + " + " + numberTwo);
        }
        return numberOne+numberTwo;
    }

    private int randomNumberGenerator(int i) {
        return new Random().nextInt(i);
    }



    public void tagRandomizer(){

        boxOrder[0] = 4;
        boxOrder[1] = 4;
        boxOrder[2] = 4;
        boxOrder[3] = 4;

        boxShown = randomResultGenerator(questionGenerator(), maxNumber);

        for (int i = 0; i<boxOrder.length; i++)
        {
            boxOrder[i] = randomNumberGenerator(4);
            Log.i("boxOrder", i + " " + String.valueOf(boxOrder[i]));

            for (int a = 0; a<i ; a++ )
            {
                if(boxOrder[i]==boxOrder[a])
                {
                    boxOrder[i] = randomNumberGenerator(4);
                    Log.i("boxIcerisi", i + " " + String.valueOf(boxOrder[i]));
                    i--;

                }
            }
        }

    }

    private int[] randomResultGenerator(int i, int max) {
        results = new int[4];
        results[0] = i;
        for(int a=1; a<results.length; a++)
        {
            results[a] = new Random().nextInt(max*2);
            if(results[a] == results[a-1])
            {
                results[a] = new Random().nextInt(max*2);
                a--;
            }
        }
        return results;
    }

    public void buttonValueAssign(){

        if(gameOn) {

            button0.setText(String.valueOf(boxShown[boxOrder[0]]));
            button1.setText(String.valueOf(boxShown[boxOrder[1]]));
            button2.setText(String.valueOf(boxShown[boxOrder[2]]));
            button3.setText(String.valueOf(boxShown[boxOrder[3]]));
        }
    }

    public void startGame(View view) {

        gameOn=true;
        tagRandomizer();
        buttonValueAssign();
        buttonTagAssign();
        countDownTimer.start();

    }

    public void buttonTapped(View view) {


        Button button = (Button) view;

        buttonTag = Integer.parseInt(button.getTag().toString());

        Log.i("button tapped", String.valueOf(buttonTag));

        if(gameOn) {
            tagRandomizer();
            buttonValueAssign();
            buttonTagAssign();
            updateScore(buttonTag);
        }
    }

    public void updateScore(int i){

        if (i == 0)
        {
            correctAnswer++;
            totalAnswer++;
            bottomText.setText("Correct");

        } else
        {
            totalAnswer++;
            bottomText.setText("Wrong");
        }
        score.setText(correctAnswer + " / " + totalAnswer);
    }
}
