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

        list.add(new ActivityCard((Integer)R.color.CIBCBlue,
                "drawable://" + R.drawable.percy_couch,
                "CIBC Aventura VISA Card for students",
                "Get travel reward for no annual fee. Special offer: double your bonus points - get up to 5,000 Aventura points!", 50, Quiz.class));

        list.add(new ActivityCard(R.color.CIBCGreen,
                "drawable://" + R.drawable.percy_couch,
                "CIBC Tim Horton's Double Double Visa Card for Students",
                "Register now and enjoy $20 Tim Cash Welcome Bonus!", 50, Quiz.class));


        list.add(new ActivityCard(R.color.CIBCTurquoise,
                "drawable://" + R.drawable.percy_couch,
                "Investors edge",
                "Register today and your first 5 trades are on us!", 50, Quiz.class));

        list.add(new ActivityCard(R.color.colorPrimary,
                "drawable://" + R.drawable.percy_couch,
                "eAdvantage Saving Account",
                "Earn 2.3% interest on new deposits!", 50, Quiz.class));

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_choose_quiz_or_article, list);

        listView.setAdapter(adapter);

    }
}
