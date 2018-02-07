package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;



public class Soal4Activity extends AppCompatActivity {

    Button s4,h4;
    LinearLayout a4;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4);

        s4 = (Button) findViewById(R.id.show4);
        h4 = (Button) findViewById(R.id.hide4);
        a4 = (LinearLayout) findViewById(R.id.ans4);
        r1 = (TextView) findViewById(R.id.rev31);

        r1.setText(Html.fromHtml("Jadi, Percepatan masing-masing benda adalah 2 m/s<sup><small>2</small></sup> <br><br> b. Besarnya kotak antar benda<br> Anda bisa menggunakan salah satu persamaan. Misalnya anda gunakan persamaan berikut<br>"));
;
        h4.setVisibility(View.GONE);
        a4.setVisibility(View.GONE);
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
        Intent i = new Intent(this, Soal5Activity.class);
        startActivity(i);
    }

    public void s4clicked(View view){
        s4.setVisibility(View.GONE);
        h4.setVisibility(View.VISIBLE);
        a4.setVisibility(View.VISIBLE);
    }

    public void h4clicked(View view){
        s4.setVisibility(View.VISIBLE);
        h4.setVisibility(View.GONE);
        a4.setVisibility(View.GONE);
    }
}
