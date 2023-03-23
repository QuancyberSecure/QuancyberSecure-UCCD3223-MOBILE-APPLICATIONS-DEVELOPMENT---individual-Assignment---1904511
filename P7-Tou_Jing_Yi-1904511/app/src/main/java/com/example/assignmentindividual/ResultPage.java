package com.example.assignmentindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        Bundle extras = getIntent().getExtras();
        /*if (extras != null) {*/
            String points = extras.getString("scores");
            TextView playerscores = findViewById(R.id.Scores);
            playerscores.setText(points);

            Intent intent = new Intent(ResultPage.this,EnterTop25.class);
            String curpoints = String.valueOf(points);
            intent.putExtra("scores",curpoints);
            startActivity(intent);
        //}

    }

    public void Home(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void StartGame(View v){
        Intent intent = new Intent(this, SelectLevel.class);
        startActivity(intent);
    }

    public void SeeScores(View v){
        Intent intent = new Intent(this, Scores.class);
        startActivity(intent);
    }

}