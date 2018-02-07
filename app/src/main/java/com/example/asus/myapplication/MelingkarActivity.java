package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;

public class MelingkarActivity extends AppCompatActivity {

    private TextView melingkar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melingkar);

        melingkar = (TextView)findViewById(R.id.textmelingkar);

        melingkar.setText(Html.fromHtml("Kelajuan minimum tertentu disebut juga kelajuan kritis (v<sub><small>k</small></sub>). Kelajuan ini diperoleh untuk N<sub><small>A</small></sub> = 0. Oleh karena itu didapat persamaan sebagai berikut,"));

    }
    public void openHome(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void openSoal(View view){
        Intent i = new Intent(this, SoalActivity.class);
        startActivity(i);
    }
    public void openQuiz(View view){
        Intent i = new Intent(this, StartQuizActivity.class);
        startActivity(i);
    }

    public void openScoreboard(View view) {
        Intent i = new Intent(this, ScoreboardActivity.class);
        startActivity(i);
    }
}
