package com.example.edgar.percypoints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class chooseQuizOrArticle extends AppCompatActivity {

    ImageView imageView;
    static final int QUIZ_TIME = 1;  // The request code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_quiz_or_article);
    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivityForResult(intent, QUIZ_TIME);
    }


}
