package com.example.sandarumk.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static String JOKE = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intentThisActivityStartedWith = getIntent();
        String joke = "No Joke Found. Try Again Later";

        if(intentThisActivityStartedWith != null){
            if(intentThisActivityStartedWith.hasExtra(JOKE)){
                joke = intentThisActivityStartedWith.getStringExtra(JOKE);
            }
        }

        TextView jokeDisplayTextView = (TextView) findViewById(R.id.tv_joke);
        jokeDisplayTextView.setText(joke);

    }
}
