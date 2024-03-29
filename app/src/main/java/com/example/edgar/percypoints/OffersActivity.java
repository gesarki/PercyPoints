package com.example.edgar.percypoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.graphics.Color.rgb;

public class OffersActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<ActivityCard> list = new ArrayList<>();

        list.add(new ActivityCard(rgb(0,167,206),
                "drawable://" + R.drawable.percy_couch,
                "Earn 2.5% interest on new deposits into eAdvantage Saving Account!",
                "", 1000, Quiz.class));

        list.add(new ActivityCard(rgb(0,193,181),
                "drawable://" + R.drawable.percy_couch,
                "No fee banking for the next month!",
                "", 500, Quiz.class));


        list.add(new ActivityCard(rgb(116,168,85),
                "drawable://" + R.drawable.percy_couch,
                "Investors edge",
                "Register today and your first 5 trades are on us!", 50, Quiz.class));

        list.add(new ActivityCard(R.color.colorPrimary,
                "drawable://" + R.drawable.percy_couch,
                "eAdvantage Saving Account",
                "Earn 2.3% interest on new deposits!", 50, Quiz.class));

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_choose_offer, list);

        listView.setAdapter(adapter);

    }
}
