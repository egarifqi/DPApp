package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal11Activity extends AppCompatActivity {

    Button s11,h11;
    LinearLayout a11;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal11);

        s11 = (Button) findViewById(R.id.show11);
        h11 = (Button) findViewById(R.id.hide11);
        a11 = (LinearLayout) findViewById(R.id.ans11);
        r1 =(TextView) findViewById(R.id.rev101);

        r1.setText(Html.fromHtml("10. Pongki menarik sebuah balok yang bermassa 10 kg dengan gaya sebesar 100 N dengan arah membentuk sudut 37<sup><small>o</small></sup> terhadap lantai. Koefisien gesek statis dan kinetik benda terhadap lantai adalah 0,5 dan 0,4. Jika percepatan gravitasi di tempat itu 10 m/s<sup><small>2</small></sup>, maka tentukan bergerak atau tidak benda tersebut, jika benda sudah bergerak tentukan percepatannya!<br>"));

        h11.setVisibility(View.GONE);
        a11.setVisibility(View.GONE);
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

    public void go10(View view){
        Intent i = new Intent(this, Soal10Activity.class);
        startActivity(i);
    }


    public void s11clicked(View view){
        s11.setVisibility(View.GONE);
        h11.setVisibility(View.VISIBLE);
        a11.setVisibility(View.VISIBLE);
    }

    public void h11clicked(View view){
        s11.setVisibility(View.VISIBLE);
        h11.setVisibility(View.GONE);
        a11.setVisibility(View.GONE);
    }
}
