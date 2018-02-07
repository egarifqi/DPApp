package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal6Activity extends AppCompatActivity {

    Button s6,h6;
    LinearLayout a6;

    private TextView r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal6);

        s6 = (Button) findViewById(R.id.show6);
        h6 = (Button) findViewById(R.id.hide6);
        a6 = (LinearLayout) findViewById(R.id.ans6);
        r1 = (TextView) findViewById(R.id.rev51);
        r2 = (TextView) findViewById(R.id.rev52);
        r3 = (TextView) findViewById(R.id.rev53);

        r1.setText(Html.fromHtml("Perhatikan gambar di atas! Dua buah benda masing-masing memiliki massa 5 kg dan 10 kg dihubungkan dengan katrol. Gesekan antara benda pertama dengan meja lantai diabaikan. Jika gaya gravitasi di tempat itu sebesar 10 m/s<sup><small>2</small></sup>, maka tentukan percepatan yang dialami kedua benda dan tegangan talinya!"));
        r2.setText(Html.fromHtml("a. percepatan kedua benda(a)<br> Karena m<sub><small>2</small></sub> > m<sub><small>1</small></sub> maka diperoleh persamaan sebagai berikut "));
        r3.setText(Html.fromHtml("Jadi, percepatan yang dialami kedua benda tersebut adalah 6,67 m/s<sup><small>2</small><sup><br>"));


        h6.setVisibility(View.GONE);
        a6.setVisibility(View.GONE);
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

    public void go5(View view){
        Intent i = new Intent(this, Soal5Activity.class);
        startActivity(i);
    }

    public void go7(View view){
        Intent i = new Intent(this, Soal7Activity.class);
        startActivity(i);
    }

    public void s6clicked(View view){
        s6.setVisibility(View.GONE);
        h6.setVisibility(View.VISIBLE);
        a6.setVisibility(View.VISIBLE);
    }

    public void h6clicked(View view){
        s6.setVisibility(View.VISIBLE);
        h6.setVisibility(View.GONE);
        a6.setVisibility(View.GONE);
    }
}
