package com.example.edgar.percypoints;

import android.content.Intent;
<<<<<<< HEAD
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
>>>>>>> master

public class MainActivity extends AppCompatActivity {
    static final int QUIZ_TIME = 1;  // The request code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
<<<<<<< HEAD

    public void open_sample_article(View view) {
        Intent intent = new Intent(this, sample_article.class);
        startActivity(intent);
    }
}
=======
    /** Called when the user taps the Send button */
    public void startQuiz(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivityForResult(intent, QUIZ_TIME);

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
    }
    public void startExtraPts(View view) {
        Intent intent = new Intent(this, chooseQuizOrArticle.class);
        startActivityForResult(intent, QUIZ_TIME);
    }


    }
>>>>>>> master
