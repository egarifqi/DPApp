package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal10Activity extends AppCompatActivity {

    Button s10,h10;
    LinearLayout a10;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal10);

        s10 = (Button) findViewById(R.id.show10);
        h10 = (Button) findViewById(R.id.hide10);
        a10 = (LinearLayout) findViewById(R.id.ans10);
        r1 = (TextView) findViewById(R.id.rev91);

        r1.setText(Html.fromHtml("9. Faisal memutar secara vertikal sebuah ember yang berisi air dengan jari-jari 0,8 m. ika percepatan gravitasi sebesar 9.8 m/s<sup><small>2</small></sup>, maka tentukan kelajuan minimum ember agar air di dalamnya tidak tumpah!<br>"));

        h10.setVisibility(View.GONE);
        a10.setVisibility(View.GONE);
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

    public void go9(View view){
        Intent i = new Intent(this, Soal9Activity.class);
        startActivity(i);
    }

    public void go11(View view){
        Intent i = new Intent(this, Soal11Activity.class);
        startActivity(i);
    }

    public void s10clicked(View view){
        s10.setVisibility(View.GONE);
        h10.setVisibility(View.VISIBLE);
        a10.setVisibility(View.VISIBLE);
    }

    public void h10clicked(View view){
        s10.setVisibility(View.VISIBLE);
        h10.setVisibility(View.GONE);
        a10.setVisibility(View.GONE);
    }
}
