package com.example.assignmentindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class level4 extends AppCompatActivity {

    public void Home(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void SeeResult(View v){
        Intent intent = new Intent(this, ResultPage.class);
        startActivity(intent);
    }

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

        Button button1 = findViewById(R.id.button1);
        int click = Color.parseColor("#FF0000");
        button1.setBackgroundColor(click);

        new CountDownTimer(5000, 1000) {

            TextView timer = findViewById(R.id.textview_2);
            public void onTick(long millisUntilFinished) {
                timer.setText("Time: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                SeeResult(timer);
                Intent intent = new Intent(level4.this,ResultPage.class);
                String curpoints = String.valueOf(points);
                intent.putExtra("scores",curpoints);
                startActivity(intent);
            }
        }.start();
    }

    public void ResetColor(View v){
        Random random = new Random();
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        int resetcolor = Color.parseColor("#0000FF");

        do{
            int randomNumber = random.nextInt(25) + 1;

            switch(v.getId()) {
                case R.id.button1:
                    points++;
                    button1.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button2:
                    points++;
                    button2.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button3:
                    points++;
                    button3.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button4:
                    points++;
                    button4.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button5:
                    points++;
                    button5.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button6:
                    points++;
                    button6.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button7:
                    points++;
                    button7.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button8:
                    points++;
                    button8.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button9:
                    points++;
                    button9.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button10:
                    points++;
                    button10.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button11:
                    points++;
                    button11.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button12:
                    points++;
                    button12.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button13:
                    points++;
                    button13.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button14:
                    points++;
                    button14.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button15:
                    points++;
                    button15.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button16:
                    points++;
                    button16.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button17:
                    points++;
                    button17.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button18:
                    points++;
                    button18.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button19:
                    points++;
                    button19.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button20:
                    points++;
                    button20.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button21:
                    points++;
                    button21.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button22:
                    points++;
                    button22.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button23:
                    points++;
                    button23.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button24:
                    points++;
                    button24.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
                case R.id.button25:
                    points++;
                    button25.setBackgroundColor(resetcolor);
                    NextColor(randomNumber);
                    break;
            }
        }while(points > 40);

    }

    public void NextColor(int ram) {
        int click = Color.parseColor("#FF0000");
        int checkcolor = Color.parseColor("#FF0000");
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        if (click == checkcolor) {
            if (ram == 1) {
                button1.setBackgroundColor(click);
            } else if (ram == 2) {
                button2.setBackgroundColor(click);
            } else if (ram == 3) {
                button3.setBackgroundColor(click);
            } else if (ram == 4) {
                button4.setBackgroundColor(click);
            }else if (ram == 5) {
                button5.setBackgroundColor(click);
            }else if (ram == 6) {
                button6.setBackgroundColor(click);
            }else if (ram == 7) {
                button7.setBackgroundColor(click);
            }else if (ram == 8) {
                button8.setBackgroundColor(click);
            }else if (ram == 9) {
                button9.setBackgroundColor(click);
            }else if (ram == 10) {
                button10.setBackgroundColor(click);
            }else if (ram == 11) {
                button11.setBackgroundColor(click);
            }else if (ram == 12) {
                button12.setBackgroundColor(click);
            } else if (ram == 13) {
                button13.setBackgroundColor(click);
            } else if (ram == 14) {
                button14.setBackgroundColor(click);
            }else if (ram == 15) {
                button15.setBackgroundColor(click);
            }else if (ram == 16) {
                button16.setBackgroundColor(click);
            }else if (ram == 17) {
                button17.setBackgroundColor(click);
            }else if (ram == 18) {
                button18.setBackgroundColor(click);
            }else if (ram == 19) {
                button19.setBackgroundColor(click);
            }else if (ram == 20) {
                button20.setBackgroundColor(click);
            }else if (ram == 21) {
                button21.setBackgroundColor(click);
            } else if (ram == 22) {
                button22.setBackgroundColor(click);
            } else if (ram == 23) {
                button23.setBackgroundColor(click);
            }else if (ram == 24) {
                button24.setBackgroundColor(click);
            }else if (ram == 25) {
                button25.setBackgroundColor(click);
            }
        }
    }
}