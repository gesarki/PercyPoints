package com.example.edgar.percypoints;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int QUIZ_TIME = 1;  // The request code
    public static int pointCount;
    public static TextView numPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pointCount = 0;
        numPoints = (TextView) findViewById(R.id.numPoints);
    }

    // for future implimentation of article card
    //public void openSampleArticle(View view) {
    //    Intent intent = new Intent(this, sample_article.class);
    //    startActivity(intent);
    //}

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
                  //TextView numPoints = (TextView) findViewById(R.id.numPoints);
//                  numPoints.setText(Integer.toString(pointCount));
//                int number = Integer.parseInt(numPoints.getText().toString());
//                number += 4;
//                numPoints.setText(Integer.toString(number));
            }
        }
    }
    public void startExtraPts(View view) {
        Intent intent = new Intent(this, chooseQuizOrArticle.class);
        startActivityForResult(intent, QUIZ_TIME);
    }
    public static void changePoints(){
        pointCount += 4;
        numPoints.setText(Integer.toString(pointCount));
    }


}
