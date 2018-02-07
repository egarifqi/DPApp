package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.text.Html;
import android.view.View;

public class KatrolActivity extends AppCompatActivity {

    private TextView katrol,ma,mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katrol);

        katrol = (TextView)findViewById(R.id.textkatrol);
        ma = (TextView) findViewById(R.id.tinjauma);
        mb = (TextView) findViewById(R.id.tinjaumb);

        katrol.setText(Html.fromHtml("Perhatikan gambar! Misalnya dua buah benda m<sub><small>a</small></sub> dan m<sub><small>b</small></sub> dihubungkan dengan seutas tali melalui sebuah katrol licin. Jika m<sub><small>a</small></sub> > m<sub><small>b</small></sub> maka m<sub><small>a</sub></small> akan bergerak ke bawah (positif) dan m<sub><small>b</small></sub> akan bergerak ke atas (negative) dengan percepatan sama."));
        ma.setText(Html.fromHtml("Tinjau benda m<sub><small>a</small></sub> :"));
        mb.setText(Html.fromHtml("Tinjau benda m<sub><small>b</small></sub> :"));
    }
    public void openHome(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void openSoal(View view){
        Intent i = new Intent(this, SoalActivity.class);
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
