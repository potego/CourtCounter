package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA = 0;
    int pointsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    //display method for team A
    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //display method for team B
    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    //Team A scores

    public void threePointsA(View view){
        pointsA += 3;
        displayForTeamA(pointsA);
    }

    public void twoPointsA(View view){
        pointsA += 2;
        displayForTeamA(pointsA);

    }

    public void freeThrowA(View view){
        pointsA += 1;
        displayForTeamA(pointsA);
    }

    //Team B scores

    public void threePointsB(View view){
        pointsB += 3;
        displayForTeamB(pointsB);
    }

    public void twoPointsB(View view){
        pointsB += 2;
        displayForTeamB(pointsB);
    }

    public void freeThrowB(View view){
        pointsB += 1;
        displayForTeamB(pointsB);
    }

    //Reset button
    public void reset(View view){
        pointsA = 0;
        pointsB = 0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }

}
