package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int netAScore = 0;
    private int netBScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void giveA3Points(View btnView) {
        netAScore += 3;
        displayForTeamA(netAScore);
    }

    public void giveA2Points(View btnView) {
        netAScore += 2;
        displayForTeamA(netAScore);
    }

    public void giveA1Point(View btnView) {
        netAScore += 1;
        displayForTeamA(netAScore);
    }

    public void giveB3Points(View btnView) {
        netBScore += 3;
        displayForTeamB(netBScore);
    }

    public void giveB2Points(View btnView) {
        netBScore += 2;
        displayForTeamB(netBScore);
    }

    public void giveB1Point(View btnView) {
        netBScore += 1;
        displayForTeamB(netBScore);
    }

    public void reset(View btnView){
        netAScore = 0;
        netBScore = 0;
        displayForTeamA(netAScore);
        displayForTeamB(netBScore);
    }
}
