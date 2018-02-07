package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HukumNewtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hukum_newton);
    }

    public void openHukum1(View view) {
        Intent i = new Intent(this, Hukum1Activity.class);
        startActivity(i);
    }

    public void openHome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openSoal(View view){
        Intent i = new Intent(this, SoalActivity.class);
        startActivity(i);
    }

    public void openHukum2(View view) {
        Intent i = new Intent(this, Hukum2Activity.class);
        startActivity(i);
    }

    public void openHukum3(View view) {
        Intent i = new Intent(this, Hukum3Activity.class);
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
