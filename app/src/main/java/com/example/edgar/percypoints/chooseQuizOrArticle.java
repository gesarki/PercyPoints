package com.example.edgar.percypoints;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.rgb;


public class chooseQuizOrArticle extends AppCompatActivity {

    ImageView imageView;
    static final int QUIZ_TIME = 1;  // The request code

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<ActivityCard> list = new ArrayList<>();
        list.add(new ActivityCard(rgb(0,167,206),
                "drawable://" + R.drawable.percy_couch,
                "Test Your EFT Knowledge!",
                "Quiz", 4, Quiz.class));

        list.add(new ActivityCard(rgb(0,193,181),
                "drawable://" + R.drawable.cibc_percy,
                "Learn About Stocks!",
                "Article", 10,Quiz.class)); //TODO: CHANGE THIS TO THE ARTICLE

        list.add(new ActivityCard(rgb(116,168,85),
                "drawable://" + R.drawable.percy_reward,
                "Learn About Stocks!",
                "Article", 10,Quiz.class)); //TODO: CHANGE THIS TO THE ARTICLE

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_choose_quiz_or_article, list);

        listView.setAdapter(adapter);


    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivityForResult(intent, QUIZ_TIME);
        MainActivity.changePoints();
    }

}
