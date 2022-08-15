package com.example.stopwatch;

import android.app.Activity;
import android.os.Bundle;

public class StopwatchActivity extends Activity {

    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }

    //Start the stopwatch running when the Start button is clicked.
    //TODO: create onClick method for Start and set running.

    //Stop the stopwatch running when the Stop button is clicked
    //TODO: create onClick method for Stop and set running.

    //Reset the stopwatch when the Reset button
    //TODO: create onClick method for reset and set running and seconds.
}