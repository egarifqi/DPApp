package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PenerapanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penerapan);
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
    public void openBidangDatar(View view){
        Intent i = new Intent(this, BidangDatarActivity.class);
        startActivity(i);
    }
    public void openBersebelahan(View view){
        Intent i = new Intent(this, BersebelahanActivity.class);
        startActivity(i);
    }
    public void openBidangMiring(View view){
        Intent i = new Intent(this, BidangMiringActivity.class);
        startActivity(i);
    }
    public void openKatrol(View view){
        Intent i = new Intent(this, KatrolActivity.class);
        startActivity(i);
    }
    public void openLift(View view){
        Intent i = new Intent(this, LiftActivity.class);
        startActivity(i);
    }
    public void openMenikung(View view){
        Intent i = new Intent(this, MenikungActivity.class);
        startActivity(i);
    }
    public void openMelingkar(View view){
        Intent i = new Intent(this, MelingkarActivity.class);
        startActivity(i);
    }
}
