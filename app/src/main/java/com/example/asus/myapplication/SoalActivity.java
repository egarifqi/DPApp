package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.Html;
import android.widget.LinearLayout;

public class SoalActivity extends AppCompatActivity {

    Button s1,h1;
    LinearLayout a1;

    private TextView r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        s1 = (Button) findViewById(R.id.show1);
        h1 = (Button) findViewById(R.id.hide1);
        a1 = (LinearLayout) findViewById(R.id.ans1);
        r1 = (TextView) findViewById(R.id.rev11);
        r2 = (TextView) findViewById(R.id.rev12);


        r1.setText(Html.fromHtml("1. Perhatikan gambar berikut ini, benda bermassa 5 kg ditarik gaya F = 10 N dengan arah 60<sup><small>o</small></sup> terhadap arah horizontal!"));
        r2.setText(Html.fromHtml("θ = 60<sup><small>o</small></sup>"));

        h1.setVisibility(View.GONE);
        a1.setVisibility(View.GONE);


    }

    public void s1clicked(View view){
        s1.setVisibility(View.GONE);
        h1.setVisibility(View.VISIBLE);
        a1.setVisibility(View.VISIBLE);
    }

    public void h1clicked(View view){
        s1.setVisibility(View.VISIBLE);
        h1.setVisibility(View.GONE);
        a1.setVisibility(View.GONE);
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


}
