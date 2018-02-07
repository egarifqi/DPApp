package com.example.asus.myapplication;

/**
 * Created by asus on 11/3/2017.
 */

public class ScoreLibrary {
    private String userRanked[];

    private int userScore[];

    public String getUserRanked(int a){
        String user = userRanked[a];
        return user;
    }

    public int getUserScore(int a){
        int uscore = userScore[a];
        return  uscore;
    }

    public void updateScoreboard(String uname, int score, int rank){
        if (rank == 1){
            userRanked[3] = userRanked[2];
            userScore[3] = userScore[2];
            userRanked[2] = userRanked[1];
            userScore[2] = userScore[1];
            userRanked[1] = uname;
            userScore[1] = score;
        }
        else{
            if(rank == 2){
                userRanked[3] = userRanked[2];
                userScore[3] = userScore[2];
                userRanked[2] = uname;
                userScore[2] = score;
            }
            else{
                if(rank == 3){
                    userRanked[3] = uname;
                    userScore[3] = score;
                }
                else{

                }
            }
        }
    }
}
