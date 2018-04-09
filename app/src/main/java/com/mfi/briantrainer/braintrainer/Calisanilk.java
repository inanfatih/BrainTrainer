package com.mfi.briantrainer.braintrainer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Calisanilk {
//
//package com.mfi.briantrainer.braintrainer;
//
//import android.os.CountDownTimer;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.Random;
//
//    public class MainActivity extends AppCompatActivity {
//        CountDownTimer countDownTimer;
//        TextView result;
//        TextView question;
//        Boolean gameOn;
//
//        Button button0;
//        Button button1;
//        Button button2;
//        Button button3;
//
//        int correctAnswer;
//        int totalAnswer;
//        TextView score;
//        int buttonTag;
//
//
//
//
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//            question = (TextView) findViewById(R.id.question);
//
//            button0 = (Button) findViewById(R.id.button0);
//            button1 = (Button) findViewById(R.id.button1);
//            button2 = (Button) findViewById(R.id.button2);
//            button3 = (Button) findViewById(R.id.button3);
//
//            gameOn = false;
//            score = (TextView) findViewById(R.id.score);
//            score.setText("0 / 0");
//
//
//            TextView score = (TextView) findViewById(R.id.score);
//
//            int maxNumber = 25;
//            int numberOne = randomNumberGenerator(maxNumber);
//            int numberTwo = randomNumberGenerator(maxNumber);
//            int result = numberOne + numberTwo;
//            question.setText(numberOne + " + " + numberTwo);
//
//            int[] boxOrder = {4,4,4,4};
//
//            int[] boxShown = randomResultGenerator(result, maxNumber);
//
//            for (int i = 0; i<boxOrder.length; i++)
//            {
//                boxOrder[i] = randomNumberGenerator(4);
//                Log.i("boxOrder", i + " " + String.valueOf(boxOrder[i]));
//
//                for (int a = 0; a<i ; a++ )
//                {
//                    if(boxOrder[i]==boxOrder[a])
//                    {
//                        boxOrder[i] = randomNumberGenerator(4);
//                        Log.i("boxIcerisi", i + " " + String.valueOf(boxOrder[i]));
//                        i--;
//
//                    }
//                }
//            }
//
//
//            button0.setText(String.valueOf(boxShown[boxOrder[0]]));
//            button1.setText(String.valueOf(boxShown[boxOrder[1]]));
//            button2.setText(String.valueOf(boxShown[boxOrder[2]]));
//            button3.setText(String.valueOf(boxShown[boxOrder[3]]));
//
//            button0.setTag(boxOrder[0]);
//            button1.setTag(boxOrder[1]);
//            button2.setTag(boxOrder[2]);
//            button3.setTag(boxOrder[3]);
//
//            Log.i("boxOrder0", String.valueOf(boxOrder[0]));
//            Log.i("boxOrder1", String.valueOf(boxOrder[1]));
//            Log.i("boxOrder2", String.valueOf(boxOrder[2]));
//            Log.i("boxOrder3", String.valueOf(boxOrder[3]));
//
//            Log.i("box0", String.valueOf(boxShown[0]));
//            Log.i("box1", String.valueOf(boxShown[1]));
//            Log.i("box2", String.valueOf(boxShown[2]));
//            Log.i("box3", String.valueOf(boxShown[3]));
//
//        }
//
//        private int randomNumberGenerator(int i) {
//            return new Random().nextInt(i);
//        }
//
//        public void tagRandomizer(){
//
//        }
//
//        private int[] randomResultGenerator(int i, int max) {
//            int[] results= new int[4];
//            results[0] = i;
//            for(int a=1; a<results.length; a++)
//            {
//                results[a] = new Random().nextInt(max*2);
//                if(results[a] == results[a-1])
//                {
//                    results[a] = new Random().nextInt(max*2);
//                    a--;
//                }
//            }
//            return results;
//        }
//
//
//
//        public void startGame(View view) {
//
//        }
//
//        public void buttonTapped(View view) {
//            Button button = (Button) view;
//
//            buttonTag = Integer.parseInt(button.getTag().toString());
//
//            Log.i("button tapped", String.valueOf(buttonTag));
//            updateScore(buttonTag);
//
//        }
//
//        public void updateScore(int i){
//
//            if (i == 0)
//            {
//                correctAnswer++;
//                totalAnswer++;
//
//            } else
//            {
//                totalAnswer++;
//            }
//            score.setText(correctAnswer + " / " + totalAnswer);
//        }
//    }

}
