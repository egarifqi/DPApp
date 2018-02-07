package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;

public class GayaBeratActivity extends AppCompatActivity {

	private TextView beratg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaya_berat);
		
		beratg = (TextView) findViewById(R.id.beratgravitasi);
		
		beratg.setText(Html.fromHtml("g = percepatan gravitasi (m/s<sup><small>2</small></sup>)"));
		
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
