package com.example.edgar.percypoints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class chooseQuizOrArticle extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_quiz_or_article);

        //imageView = (ImageView) findViewById(R.id.first_card_image);
        //imageView.setBackgroundColor(000000);


    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }


}
