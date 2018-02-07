package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal3Activity extends AppCompatActivity {
    Button s3,h3;
    LinearLayout a3;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        s3 = (Button) findViewById(R.id.show2);
        h3 = (Button) findViewById(R.id.hide2);
        a3 = (LinearLayout) findViewById(R.id.ans2);


        h3.setVisibility(View.GONE);
        a3.setVisibility(View.GONE);
    }

    public void openHome(View view){
        Intent i = new Intent(this, MainActivity.class);
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

    public void go2(View view){
        Intent i = new Intent(this, Soal2Activity.class);
        startActivity(i);
    }

    public void go4(View view){
        Intent i = new Intent(this, Soal4Activity.class);
        startActivity(i);
    }

    public void s3clicked(View view){
        s3.setVisibility(View.GONE);
        h3.setVisibility(View.VISIBLE);
        a3.setVisibility(View.VISIBLE);
    }

    public void h3clicked(View view){
        s3.setVisibility(View.VISIBLE);
        h3.setVisibility(View.GONE);
        a3.setVisibility(View.GONE);
    }
}
