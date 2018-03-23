package com.example.edgar.percypoints;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import static android.graphics.Color.rgb;

public class TuttiFruttiActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anush);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Added to favorites", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                fab.setImageResource(R.drawable.ic_star_yellow_24dp);
            }
        });

        listView = (ListView) findViewById(R.id.listView_store);
        ArrayList<ActivityCard> offerList = new ArrayList<>();

        offerList.add(new ActivityCard(rgb(116,168,85), "drawable://" + R.drawable.tutti_frutty_candy_heart,
                "Get 50g of candy for free!", "", 15000, Barcode.class));

        offerList.add(new ActivityCard(rgb(212,1,57), "drawable://" + R.drawable.tutti_frutti_slushies,
                "Get a Slushy for 50 cents!", "", 10000, Barcode.class));

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_choose_offer, offerList);

        listView.setAdapter(adapter);

    }
}
