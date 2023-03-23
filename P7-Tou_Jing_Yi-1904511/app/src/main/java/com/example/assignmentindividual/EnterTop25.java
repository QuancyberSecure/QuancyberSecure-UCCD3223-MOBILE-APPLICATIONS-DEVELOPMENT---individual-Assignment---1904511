package com.example.assignmentindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnterTop25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_top25);
    }



    public void Done(View v){

        SharedPreferences pref = getSharedPreferences("top25player",MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = pref.edit();

        Bundle extras = getIntent().getExtras();
        String Strpoints = extras.getString("scores");
        int points = Integer.parseInt(Strpoints);


        EditText name = findViewById(R.id.PlayerName);
        String playername = name.getText().toString();

        if(!playername.isEmpty()){
            prefEditor.putString("name",playername);
            prefEditor.putInt("scores",points);
            prefEditor.commit();

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        Intent intent = new Intent(EnterTop25.this,ResultPage.class);
        startActivity(intent);

    }
}