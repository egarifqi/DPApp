package com.example.asus.myapplication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartQuizActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
    }

    public void openHome(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void openSoal(View view) {
        Intent i = new Intent(this, SoalActivity.class);
        startActivity(i);
    }
    public void openScoreboard(View view) {
        Intent i = new Intent(this, ScoreboardActivity.class);
        startActivity(i);
    }
    public void openQ1(View view){
        EditText mUserid = (EditText)findViewById(R.id.username);
        Intent i = new Intent(this, Q1Activity.class);
        i.putExtra("idstring", mUserid.getText().toString());
        startActivity(i);
    }

    @Override
    public void onBackPressed(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
