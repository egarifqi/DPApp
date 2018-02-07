package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal9Activity extends AppCompatActivity {

    Button s9,h9;
    LinearLayout a9;

    private TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal9);

        s9 = (Button) findViewById(R.id.show9);
        h9 = (Button) findViewById(R.id.hide9);
        a9 = (LinearLayout) findViewById(R.id.ans9);
        r1 = (TextView) findViewById(R.id.rev81);

        r1.setText(Html.fromHtml("8. Sitompul mengikat bandul yang bermassa 0,1 kg dengan seutas tali dan diputar vertikal dengan kecepatan tetap 4 m/s<sup><small>2</small></sup>. Jika panjang tali 1 m dan percepatan gravitasi 10 m/s<sup><small>2</small></sup>, maka tentukan tegangan tali saat bolpoint berada di posisi terendah dan posisi tertinggi!<br>"));

        h9.setVisibility(View.GONE);
        a9.setVisibility(View.GONE);
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

    public void go8(View view){
        Intent i = new Intent(this, Soal8Activity.class);
        startActivity(i);
    }

    public void go10(View view){
        Intent i = new Intent(this, Soal10Activity.class);
        startActivity(i);
    }

    public void s9clicked(View view){
        s9.setVisibility(View.GONE);
        h9.setVisibility(View.VISIBLE);
        a9.setVisibility(View.VISIBLE);
    }

    public void h9clicked(View view){
        s9.setVisibility(View.VISIBLE);
        h9.setVisibility(View.GONE);
        a9.setVisibility(View.GONE);
    }
}
