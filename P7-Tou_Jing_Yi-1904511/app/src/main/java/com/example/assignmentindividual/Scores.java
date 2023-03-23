package com.example.assignmentindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Scores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        SharedPreferences pref = getSharedPreferences("top25player",MODE_PRIVATE);

        String name = pref.getString("name","");
        int scores = pref.getInt("scores",0);

        TextView display = findViewById(R.id.textview_2);
        display.setText(name + "        "  + scores);
    }
}