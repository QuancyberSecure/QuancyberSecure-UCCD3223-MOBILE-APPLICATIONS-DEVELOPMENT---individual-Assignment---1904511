package com.example.assignmentindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartGame(View v){
        Intent intent = new Intent(this, SelectLevel.class);
        startActivity(intent);
    }

    public void SeeScores(View v){
        Intent intent = new Intent(this, Scores.class);
        startActivity(intent);
    }

    public void HowtoPlay(View v){
        Intent intent = new Intent(this, howtoplay.class);
        startActivity(intent);
    }

    public void QuitGame(View v){
        finish();
    }
}