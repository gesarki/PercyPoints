package com.example.edgar.percypoints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int QUIZ_TIME = 1;  // The request code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void startQuiz(View view) {
        Intent intent = new Intent(this, Quiz.class);
<<<<<<< HEAD
        startActivityForResult(intent, QUIZ_TIME);
=======

        startActivityForResult(intent, QUIZ_TIME);


>>>>>>> df29d367f1c6aae3591991db9d730208cd1d9a10
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == QUIZ_TIME) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                TextView numPoints = (TextView) findViewById(R.id.numPoints);
                int number = Integer.parseInt(numPoints.getText().toString());
                number += 4;
                numPoints.setText(Integer.toString(number));
            }
        }
<<<<<<< HEAD
    }
    public void startExtraPts(View view) {
        Intent intent = new Intent(this, chooseQuizOrArticle.class);
        startActivity(intent);
=======
>>>>>>> df29d367f1c6aae3591991db9d730208cd1d9a10
    }


    }
