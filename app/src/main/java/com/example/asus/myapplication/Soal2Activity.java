package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.text.Html;
import android.widget.LinearLayout;



public class Soal2Activity extends AppCompatActivity {

    Button s2,h2;
    LinearLayout a2;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        s2 = (Button) findViewById(R.id.show2);
        h2 = (Button) findViewById(R.id.hide2);
        a2 = (LinearLayout) findViewById(R.id.ans2);
        r1 = (TextView) findViewById(R.id.rev21);

        r1.setText(Html.fromHtml("2. Sebuah balok es yang memiliki massa 25 kg didorong Rafli, dengan sudut 30<sup><small>o</small></sup>. Jika balok es bergerak dengan percepatan konstan 1/4 √3 m/s<sup><small>2</small></sup>, maka tentukan besar gaya dorongan Rafli!"));


        h2.setVisibility(View.GONE);
        a2.setVisibility(View.GONE);
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

    public void go1(View view){
        Intent i = new Intent(this, SoalActivity.class);
        startActivity(i);
    }

    public void go23(View view){
        Intent i = new Intent(this, Soal4Activity.class);
        startActivity(i);
    }

    public void s2clicked(View view){
        s2.setVisibility(View.GONE);
        h2.setVisibility(View.VISIBLE);
        a2.setVisibility(View.VISIBLE);
    }

    public void h2clicked(View view){
        s2.setVisibility(View.VISIBLE);
        h2.setVisibility(View.GONE);
        a2.setVisibility(View.GONE);
    }
}
