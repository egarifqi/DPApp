package com.example.asus.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Q9Activity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mQuestionView;
    private TextView mNumber;
    private LinearLayout mBody;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonChoice5;
    private Button mButtonNext;
    private ImageView s51;
    private ImageView s52;
    private ImageView s53;
    private ImageView s54;
    private ImageView s55;
    private ImageView s9;
    private ImageView s10;
    private ImageView s13;
    private ImageView s14;

    private String mAnswer;
    private String mUserid;
    private int mQuestionNumber = 41;
    private String qNumber = "Q0";
    private int mScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);

        mBody = (LinearLayout)findViewById(R.id.body);
        mQuestionView = (TextView)findViewById(R.id.soal9);
        mButtonChoice1 = (Button)findViewById(R.id.ans9A);
        mButtonChoice2 = (Button)findViewById(R.id.ans9B);
        mButtonChoice3 = (Button)findViewById(R.id.ans9C);
        mButtonChoice4 = (Button)findViewById(R.id.ans9D);
        mButtonChoice5 = (Button)findViewById(R.id.ans9E);
        mButtonNext = (Button)findViewById(R.id.next9);
        mNumber = (TextView)findViewById(R.id.questionNumber);
        s51 = (ImageView)findViewById(R.id.soal51);
        s52 = (ImageView)findViewById(R.id.soal52);
        s53 = (ImageView)findViewById(R.id.soal53);
        s54 = (ImageView)findViewById(R.id.soal54);
        s55 = (ImageView)findViewById(R.id.soal55);
        s9 = (ImageView)findViewById(R.id.soal99);
        s10 = (ImageView)findViewById(R.id.soal10);
        s13 = (ImageView)findViewById(R.id.soal13);
        s14 = (ImageView)findViewById(R.id.soal14);

        s51.setVisibility(View.GONE);
        s52.setVisibility(View.GONE);
        s53.setVisibility(View.GONE);
        s54.setVisibility(View.GONE);
        s55.setVisibility(View.GONE);
        s9.setVisibility(View.GONE);
        s10.setVisibility(View.GONE);
        s13.setVisibility(View.GONE);
        s14.setVisibility(View.GONE);

        Bundle bundle = getIntent().getExtras();
        mScore = bundle.getInt("score8");//
        qNumber = "Q9";

        //Random Soal
        Random rand = new Random();

        mQuestionNumber = rand.nextInt(49) + 0;

        if(mQuestionNumber == 4){
            s51.setVisibility(View.VISIBLE);
            s52.setVisibility(View.VISIBLE);
            s53.setVisibility(View.VISIBLE);
            s54.setVisibility(View.VISIBLE);
            s55.setVisibility(View.VISIBLE);
        }

        if(mQuestionNumber == 8){
            s9.setVisibility(View.VISIBLE);
        }

        if(mQuestionNumber == 9){
            s10.setVisibility(View.VISIBLE);
        }

        if(mQuestionNumber == 12 ){
            s13.setVisibility(View.VISIBLE);
        }

        if(mQuestionNumber == 13){
            s14.setVisibility(View.VISIBLE);
        }

        mNumber.setText(qNumber);
        mQuestionView.setText(Html.fromHtml(mQuestionLibrary.getQuestion(mQuestionNumber)));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        mButtonChoice5.setText(mQuestionLibrary.getChoice5(mQuestionNumber));
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
    }

    public void ansA(View view){
        if(mButtonChoice1.getText() == mAnswer){
            mButtonChoice1.setBackgroundColor(Color.parseColor("#00FF00"));
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
            mScore = mScore + 10;
        }
        else{
            mButtonChoice1.setBackgroundColor(Color.parseColor("#FF0000"));
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
        }
        mButtonNext.setVisibility(View.VISIBLE);
    }

    public void ansB(View view){
        if(mButtonChoice2.getText() == mAnswer){
            mButtonChoice2.setBackgroundColor(Color.parseColor("#00FF00"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
            mScore = mScore + 10;
        }
        else{
            mButtonChoice2.setBackgroundColor(Color.parseColor("#FF0000"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
        }
        mButtonNext.setVisibility(View.VISIBLE);
    }

    public void ansC(View view){
        if(mButtonChoice3.getText() == mAnswer){
            mButtonChoice3.setBackgroundColor(Color.parseColor("#00FF00"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
            mScore = mScore + 10;
        }
        else{
            mButtonChoice3.setBackgroundColor(Color.parseColor("#FF0000"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
        }
        mButtonNext.setVisibility(View.VISIBLE);
    }

    public void ansD(View view){
        if(mButtonChoice4.getText() == mAnswer){
            mButtonChoice4.setBackgroundColor(Color.parseColor("#00FF00"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
            mScore = mScore + 10;
        }
        else{
            mButtonChoice4.setBackgroundColor(Color.parseColor("#FF0000"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mButtonChoice5.setVisibility(View.INVISIBLE);
        }
        mButtonNext.setVisibility(View.VISIBLE);
    }

    public void ansE(View view){
        if(mButtonChoice5.getText() == mAnswer){
            mButtonChoice5.setBackgroundColor(Color.parseColor("#00FF00"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mScore = mScore + 10;
        }
        else{
            mButtonChoice5.setBackgroundColor(Color.parseColor("#FF0000"));
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonChoice4.setVisibility(View.INVISIBLE);
            mButtonChoice2.setVisibility(View.INVISIBLE);
        }
        mButtonNext.setVisibility(View.VISIBLE);
    }

    public void next(View view){
        Bundle bundle = getIntent().getExtras();
        mUserid = bundle.getString("idstring9");
        Intent i = new Intent(this, Q10Activity.class);
        i.putExtra("idstring10",mUserid);
        i.putExtra("score9", mScore);
        startActivity(i);

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            //super.onBackPressed();
            Intent i = new Intent(this, StartQuizActivity.class);
            startActivity(i);
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press again to exit quiz", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
