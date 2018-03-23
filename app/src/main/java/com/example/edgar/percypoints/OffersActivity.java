package com.example.edgar.percypoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static android.graphics.Color.rgb;

public class OffersActivity extends AppCompatActivity {

    private ListView listView;

    String images [] = {"drawable://" + R.drawable.percy_couch, "drawable://" + R.drawable.percy_ball, "drawable://" + R.drawable.percy_happy,
            "drawable://" + R.drawable.percy_vacay, "drawable://" + R.drawable.percy_palm, "drawable://" + R.drawable.percy_other_couch,
            "drawable://" + R.drawable.percy_mailbox, "drawable://" + R.drawable.cibc_percy};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        Random rand = new Random();

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<ActivityCard> list = new ArrayList<>();

        list.add(new ActivityCard(rgb(116,168,85),
                images[7],
                "Investors edge",
                "Register today and your first 5 trades are on us!", 50, Quiz.class));

        list.add(new ActivityCard(rgb(212,1,57),
                images[1],
                "eAdvantage Saving Account",
                "Earn 2.3% interest on new deposits!", 50, Quiz.class));

        list.add(new ActivityCard(rgb(0,167,206), images[6],
                "Earn 2.5% interest on new deposits into eAdvantage Saving Account!",
                "", 1000, Quiz.class));

        list.add(new ActivityCard(rgb(0,193,181),
                images[5],
                "No fee banking for the next month!",
                "", 500, Quiz.class));



        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_choose_quiz_or_article, list);

        listView.setAdapter(adapter);

    }
}
