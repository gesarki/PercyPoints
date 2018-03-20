package com.example.edgar.percypoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        TextView QuestionText = (TextView) findViewById(R.id.text_question);
        QuestionText.setVisibility(View.INVISIBLE);
    }
    public void start_game(View view){
        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setVisibility(View.INVISIBLE);
        TextView QuestionText = (TextView) findViewById(R.id.text_question);
        QuestionText.setVisibility(View.VISIBLE);
        Button answer1 = (Button) findViewById(R.id.answer1);
        answer1.setText("Exchange-Traded Fund");
        Button answer2 = (Button) findViewById(R.id.answer2);
        answer2.setText("Etf");
        Button answer3 = (Button) findViewById(R.id.answer3);
        answer3.setText("etf");
        Button answer4 = (Button) findViewById(R.id.answer4);
        answer4.setText("ETFF");
        
    }

}
