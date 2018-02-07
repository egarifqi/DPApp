package com.example.asus.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ScoreboardActivity extends AppCompatActivity {

    String[] daftar;
    Menu menu;
    protected Cursor cursor;
    DatabaseHelper dbcenter;
    public static ScoreboardActivity sa;

    private TextView mUserRanked1;
    private TextView mUserRanked2;
    private TextView mUserRanked3;
    private TextView mUserScore1;
    private TextView mUserScore2;
    private TextView mUserScore3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        mUserRanked1 = (TextView)findViewById(R.id.rank1);
        mUserRanked2 = (TextView)findViewById(R.id.rank2);
        mUserRanked3 = (TextView)findViewById(R.id.rank3);
        mUserScore1 = (TextView)findViewById(R.id.scorerank1);
        mUserScore2 = (TextView)findViewById(R.id.scorerank2);
        mUserScore3 = (TextView)findViewById(R.id.scorerank3);

        sa = this;

        dbcenter = new DatabaseHelper(this);

        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT username FROM rank ORDER BY score DESC",null);
        cursor.moveToFirst();
        cursor.moveToPosition(0);
        mUserRanked1.setText(cursor.getString(0).toString());
        cursor.moveToPosition(1);
        mUserRanked2.setText(cursor.getString(0).toString());
        cursor.moveToPosition(2);
        mUserRanked3.setText(cursor.getString(0).toString());

        cursor = db.rawQuery("SELECT score FROM rank ORDER BY score DESC",null);
        cursor.moveToFirst();
        cursor.moveToPosition(0);
        mUserScore1.setText(""+cursor.getInt(0));
        cursor.moveToPosition(1);
        mUserScore2.setText(""+cursor.getInt(0));
        cursor.moveToPosition(2);
        mUserScore3.setText(""+cursor.getInt(0));


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


}
