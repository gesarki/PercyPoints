package com.example.edgar.percypoints;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.hookedonplay.decoviewlib.DecoView;
import com.hookedonplay.decoviewlib.charts.SeriesItem;
import com.hookedonplay.decoviewlib.events.DecoEvent;


public class MainActivity extends AppCompatActivity {
    static final int QUIZ_TIME = 1;  // The request code
    public static int pointCount;
    public static TextView numPoints;
    public static int currLevel = 60;
    public static int nextLevel = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pointCount = 0;
        numPoints = (TextView) findViewById(R.id.numPoints);


        // Data Visualization
        DecoView decoView = (DecoView) findViewById(R.id.dynamicArcView);

        final SeriesItem seriesItem = new SeriesItem.Builder(Color.parseColor("#FFE2E2E2"))
                .setRange(0, 62, 0)
                .build();

        int backIndex = decoView.addSeries(seriesItem);

        final SeriesItem seriesItem2 = new SeriesItem.Builder(Color.parseColor("#fca311"))
                .setRange(0, 100, 0)
                .build();

        int series1Index = decoView.addSeries(seriesItem2);

        final TextView textPercentage = (TextView) findViewById(R.id.percentSteps);

        seriesItem.addArcSeriesItemListener(new SeriesItem.SeriesItemListener() {
            @Override
            public void onSeriesItemAnimationProgress(float percentComplete, float currentPosition) {
                float percentFilled = ((currentPosition - seriesItem2.getMinValue()) / (seriesItem2.getMaxValue() - seriesItem2.getMinValue()));
                textPercentage.setText(String.format("%.0f%%", percentFilled * 100f));
            }

            @Override
            public void onSeriesItemDisplayProgress(float percentComplete) {

            }
        });

        decoView.addEvent(new DecoEvent.Builder(62)
                .setIndex(backIndex)
                .build());

        decoView.addEvent(new DecoEvent.Builder(62)
                .setIndex(series1Index)
                .setDelay(2000)
                .build());

    }

    // for future implementation of article card
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
        refreshPoint();
    }
    public void redeemPoints(View view){
        Intent intent = new Intent(this, Redemption.class);
        startActivity(intent);
    }

    public static void changePoints(){
        pointCount += 4;
        numPoints.setText(Integer.toString(pointCount));
    }
    public static void refreshPoint(){
        numPoints.setText(Integer.toString(pointCount));
    }

    public void openMaps(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



}
