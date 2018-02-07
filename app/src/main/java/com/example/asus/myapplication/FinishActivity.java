package com.example.asus.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    private TextView mUsername;
    private TextView mScoreakhir;

    protected Cursor cursor;
    DatabaseHelper dbcenter;

    private String mUserid;
    private int mScore;
    private int score1;
    private int score2;
    private int score3;
    private int rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        mUsername = (TextView)findViewById(R.id.username);
        mScoreakhir = (TextView)findViewById(R.id.scoreakhir);

        Bundle bundle = getIntent().getExtras();
        mUserid = bundle.getString("idstringfinish");
        Bundle bundle1 = getIntent().getExtras();
        mScore = bundle1.getInt("score10");


        dbcenter = new DatabaseHelper(this);

        mUsername.setText(mUserid);
        mScoreakhir.setText(""+mScore);


        SQLiteDatabase db = dbcenter.getWritableDatabase();
        cursor = db.rawQuery("SELECT * FROM rank",null);
        int lastNum = cursor.getCount() + 1;
        db.execSQL("INSERT INTO rank(no, username, score) VALUES('" + lastNum + "','" +
        mUserid + "','" +
        mScore + "')");
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

    @Override
    public void onBackPressed(){
        Intent i = new Intent(this, StartQuizActivity.class);
        startActivity(i);
    }

}
