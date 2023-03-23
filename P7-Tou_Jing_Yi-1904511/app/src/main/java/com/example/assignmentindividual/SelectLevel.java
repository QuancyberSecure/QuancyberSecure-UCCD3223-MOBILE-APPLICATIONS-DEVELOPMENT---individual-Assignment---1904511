package com.example.assignmentindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);

    }

    public void golevel1(View v){
        Intent intent = new Intent(this, level1.class);
        startActivity(intent);
    }

    public void golevel2(View v){
        Intent intent = new Intent(this, level2.class);
        startActivity(intent);
    }

    public void golevel3(View v){
        Intent intent = new Intent(this, level3.class);
        startActivity(intent);
    }

    public void golevel4(View v){
        Intent intent = new Intent(this, level4.class);
        startActivity(intent);
    }

    public void golevel5(View v){
        Intent intent = new Intent(this, level5.class);
        startActivity(intent);
    }
}