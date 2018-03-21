package com.example.edgar.percypoints;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Redemption extends AppCompatActivity {
    public static TextView numPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redemption);
        numPoints = (TextView) findViewById(R.id.numPoints);
        numPoints.setText(Integer.toString(MainActivity.pointCount));
    }

    public void redeemCoffee(View view){
        if(MainActivity.pointCount >= 4){
            MainActivity.pointCount -= 4;
            refreshPoint();
            MainActivity.refreshPoint();
            Intent intent = new Intent(this, Barcode.class);
            startActivity(intent);
        }
        else{
            AlertDialog.Builder builder = new AlertDialog.Builder(Redemption.this);
            builder.setTitle("You don't have enough points!");
            builder.show();
    }
    }
    public void redeemInterest(View view){
        if(MainActivity.pointCount >= 8){
            MainActivity.pointCount -= 8;
            refreshPoint();
            MainActivity.refreshPoint();
            Intent intent = new Intent(this, Barcode.class);
            startActivity(intent);

        }
        else{

            AlertDialog.Builder builder = new AlertDialog.Builder(Redemption.this);
            builder.setTitle("You don't have enough points!");
            builder.show();

        }
    }
    public void refreshPoint(){
        numPoints.setText(Integer.toString(MainActivity.pointCount));
    }
}
