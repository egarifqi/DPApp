package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;

public class BersebelahanActivity extends AppCompatActivity {

	private TextView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bersebelahan);
		
		b = (TextView) findViewById(R.id.bersentuhan);
		b.setText(Html.fromHtml("Misalkan dua benda m<sub><small>a</small></sub> dan m<sub><small>b</small></sub> bersentuhan dan diletakkan pada bidang datar licin seperti pada gambar di atas. Kedua benda tersebut didorong dengan gaya F maka persamaannya dapat dituliskan sebagai berikut."));
    }
    public void openHome(View view) {
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
