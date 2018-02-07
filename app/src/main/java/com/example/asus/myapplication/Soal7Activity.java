package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal7Activity extends AppCompatActivity {

    Button s7,h7;
    LinearLayout a7;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal7);

        s7 = (Button) findViewById(R.id.show7);
        h7 = (Button) findViewById(R.id.hide7);
        a7 = (LinearLayout) findViewById(R.id.ans7);
        r1 = (TextView) findViewById(R.id.rev61);

        r1.setText(Html.fromHtml("6. Oneng yang bermassa 30 kg berdiri di dalam sebuah lift yang bergerak dengan percepatan 3 m/s<sup><small>2</small></sup>. Jika percepatan gravitasi 10 m/s<sup><small>2</small></sup>, maka tentukan berat Oneng saat lift bergerak ke atas dipercepatan dan bergerak ke bawah dipercepat!"));

        h7.setVisibility(View.GONE);
        a7.setVisibility(View.GONE);
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
    public void go6(View view){
        Intent i = new Intent(this, Soal6Activity.class);
        startActivity(i);
    }
    public void go8(View view){
        Intent i = new Intent(this, Soal8Activity.class);
        startActivity(i);
    }
    public void s7clicked(View view){
        s7.setVisibility(View.GONE);
        h7.setVisibility(View.VISIBLE);
        a7.setVisibility(View.VISIBLE);
    }

    public void h7clicked(View view){
        s7.setVisibility(View.VISIBLE);
        h7.setVisibility(View.GONE);
        a7.setVisibility(View.GONE);
    }
}
