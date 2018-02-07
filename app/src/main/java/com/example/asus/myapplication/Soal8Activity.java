package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal8Activity extends AppCompatActivity {

    Button s8,h8;
    LinearLayout a8;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal8);

        s8 = (Button) findViewById(R.id.show8);
        h8 = (Button) findViewById(R.id.hide8);
        a8 = (LinearLayout) findViewById(R.id.ans8);
        r1 = (TextView) findViewById(R.id.rev71);

        r1.setText(Html.fromHtml("7. Seorang pembalap akan melewati tikungan jalan yang berjari-jari 80 m dengan sudut kemiringan 37<sup><small>o</small></sup>. Jika percepatan gravitasi 10 m/s<sup><small>2</small></sup>, maka tentukan kecepatan maksimum pembalap agar tidak tergelincir dari lintasan? <br>"));

        h8.setVisibility(View.GONE);
        a8.setVisibility(View.GONE);
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

    public void go7(View view){
        Intent i = new Intent(this, Soal7Activity.class);
        startActivity(i);
    }

    public void go9(View view){
        Intent i = new Intent(this, Soal9Activity.class);
        startActivity(i);
    }

    public void s8clicked(View view){
        s8.setVisibility(View.GONE);
        h8.setVisibility(View.VISIBLE);
        a8.setVisibility(View.VISIBLE);
    }

    public void h8clicked(View view){
        s8.setVisibility(View.VISIBLE);
        h8.setVisibility(View.GONE);
        a8.setVisibility(View.GONE);
    }
}
