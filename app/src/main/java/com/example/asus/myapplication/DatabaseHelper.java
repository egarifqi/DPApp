package com.example.asus.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 11/10/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ranked.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //TODO Auto-generated method stub
        String sql = "create table rank(no integer primary key, username text null, score integer null);";
        Log.d("Data", "onCreate: "+sql);
        db.execSQL(sql);
        sql = " INSERT INTO rank(no, username, score) VALUES ('1', 'rankxxx', '0');";
        db.execSQL(sql);
        sql = " INSERT INTO rank(no, username, score) VALUES ('2', 'rankxxx', '0');";
        db.execSQL(sql);
        sql = " INSERT INTO rank(no, username, score) VALUES ('3', 'rankxxx', '0');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){
        //TODO Auto-generated method stub
    }
}
