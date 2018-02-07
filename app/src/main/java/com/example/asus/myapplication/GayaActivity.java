package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GayaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_gaya);
   }
    public void openHome(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void openSoal(View view){
        Intent i = new Intent(this, SoalActivity.class);
        startActivity(i);
    }
    public void openGayaBerat(View view){
        Intent i = new Intent(this, GayaBeratActivity.class);
        startActivity(i);
    }
    public void openGayaNormal(View view){
        Intent i = new Intent(this, GayaNormalActivity.class);
        startActivity(i);
    }
    public void openGayaGesek(View view){
        Intent i = new Intent(this, GayaGesekActivity.class);
        startActivity(i);
    }
    public void openGayaTeganganTali(View view){
        Intent i = new Intent(this, GayaTeganganTaliActivity.class);
        startActivity(i);
    }
    public void openGayaSentripetal(View view){
        Intent i = new Intent(this, GayaSentripetalActivity.class);
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
