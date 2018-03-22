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
import java.util.Random;

import static android.graphics.Color.rgb;





public class chooseQuizOrArticle extends AppCompatActivity {

    static final int QUIZ_TIME = 1;  // The request code

    private ListView listView;
    String images [] = {"drawable://" + R.drawable.percy_couch, "drawable://" + R.drawable.percy_ball, "drawable://" + R.drawable.percy_happy,
            "drawable://" + R.drawable.percy_vacay, "drawable://" + R.drawable.percy_palm, "drawable://" + R.drawable.percy_other_couch,
            "drawable://" + R.drawable.percy_mailbox, "drawable://" + R.drawable.cibc_percy,"drawable://" + R.drawable.percy_reward };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        Random rand = new Random();

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<ActivityCard> list = new ArrayList<>();
        list.add(new ActivityCard(rgb(0,167,206),
                images[3],
                "Test Your ETF Knowledge!",
                "Quiz", 4, Quiz.class));

        list.add(new ActivityCard(rgb(0,193,181),
                images[8],
                "Learn About Stocks!",
                "Article", 10,sample_article.class));

        list.add(new ActivityCard(rgb(116,168,85),
                images[2],
                "Tell Us About Yourself!",
                "Feedback", 10,Quiz.class));

        list.add(new ActivityCard(rgb(116,168,85),
                images[4],
                "Shop CIBC Products!",
                "Feature", 15,Quiz.class));

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_choose_quiz_or_article, list);

        listView.setAdapter(adapter);


    }


}
