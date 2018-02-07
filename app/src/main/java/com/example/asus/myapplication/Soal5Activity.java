package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class Soal5Activity extends AppCompatActivity {

    Button s5,h5;
    LinearLayout a5;

    private TextView r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);

        s5 = (Button) findViewById(R.id.show5);
        h5 = (Button) findViewById(R.id.hide5);
        a5 = (LinearLayout) findViewById(R.id.ans5);
        r1 = (TextView) findViewById(R.id.rev41);
        r2 = (TextView) findViewById(R.id.rev42);
        r3 = (TextView) findViewById(R.id.rev43);

        r1.setText(Html.fromHtml("4. Sebuah balok yang massanya 6 kg meluncur ke bawah pada sebuah papan licin yang dimiringkan 30<sup><small>o</small></sup> dari lantai. Jika jarak lantai dengan balok 10 m dan besarnya gravitasi di tempat itu 10 m/s<sup><small>2</small></sup>, maka tentukan percepatan dan waktu yang diperlukan balok untuk sampai di lantai!<br>"));
        r2.setText(Html.fromHtml("Gaya berat balok diuraikan pada sumbu X (bidang miring) dan sumbu Y (garis tegak lurus bidang miring). Benda meluncur dengan gaya F=w sin 30<sup><small>o</small></sup>"));
        r3.setText(Html.fromHtml("Jadi, balok tersebut meluncur ke bawa dengan percepatan 5 m/s<sup><small>2</small></sup> <br> <br> b. Ingat persamaan pada GLBB<br>"));

        h5.setVisibility(View.GONE);
        a5.setVisibility(View.GONE);
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

    public void go4(View view){
        Intent i = new Intent(this, Soal4Activity.class);
        startActivity(i);
    }

    public void go6(View view){
        Intent i = new Intent(this, Soal6Activity.class);
        startActivity(i);
    }

    public void s5clicked(View view){
        s5.setVisibility(View.GONE);
        h5.setVisibility(View.VISIBLE);
        a5.setVisibility(View.VISIBLE);
    }

    public void h5clicked(View view){
        s5.setVisibility(View.VISIBLE);
        h5.setVisibility(View.GONE);
        a5.setVisibility(View.GONE);
    }
}
