package com.example.assignmentindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class level1 extends AppCompatActivity {

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
        setContentView(R.layout.activity_level1);

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
                Intent intent = new Intent(level1.this,ResultPage.class);
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
        int resetcolor = Color.parseColor("#0000FF");

        do{
            int randomNumber = random.nextInt(4) + 1;

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
                default:
                    break;
            }
        }while(points > 10);

    }

    public void NextColor(int ram){
        int click = Color.parseColor("#FF0000");
        int checkcolor = Color.parseColor("#FF0000");
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        if(click == checkcolor){
            if(ram == 1){
                button1.setBackgroundColor(click);
            }else if(ram == 2){
                button2.setBackgroundColor(click);
            }else if(ram == 3){
                button3.setBackgroundColor(click);
            }else if(ram == 4){
                button4.setBackgroundColor(click);
            }
        }
    }

}