package com.example.asus.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            //super.onBackPressed();
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    public void openSoal(View view){
        Intent i = new Intent(this, SoalActivity.class);
        startActivity(i);
    }

    public void openHukumNewton(View view){
        Intent i = new Intent(this, HukumNewtonActivity.class);
        startActivity(i);
    }

    public void openGaya(View view){
        Intent i = new Intent(this, GayaActivity.class);
        startActivity(i);
    }

    public void openPenerapan(View view){
        Intent i = new Intent(this, PenerapanActivity.class);
        startActivity(i);
    }

    public void openQuiz(View view){
        Intent i = new Intent(this, StartQuizActivity.class);
        startActivity(i);
    }

    public void openScoreboard(View view){
        Intent i = new Intent(this, ScoreboardActivity.class);
        startActivity(i);
    }
}
