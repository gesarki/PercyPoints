package com.example.edgar.percypoints;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
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
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        questionID.setVisibility(View.INVISIBLE);
        TextView endPhrase = (TextView) findViewById(R.id.endPhrase);
        endPhrase.setVisibility(View.INVISIBLE);
        Button answer1 = (Button) findViewById(R.id.answer1);
        Button answer2 = (Button) findViewById(R.id.answer2);
        Button answer3 = (Button) findViewById(R.id.answer3);
        Button answer4 = (Button) findViewById(R.id.answer4);
        answer1.setVisibility(View.INVISIBLE);
        answer2.setVisibility(View.INVISIBLE);
        answer3.setVisibility(View.INVISIBLE);
        answer4.setVisibility(View.INVISIBLE);
    }
    public void start_game(View view){
        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setVisibility(View.INVISIBLE);
        TextView QuestionText = (TextView) findViewById(R.id.text_question);
        QuestionText.setVisibility(View.VISIBLE);
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        questionID.setVisibility(View.VISIBLE);
        Button answer1 = (Button) findViewById(R.id.answer1);
        answer1.setVisibility(View.VISIBLE);
        answer1.setText("Exchange-Traded Fund");
        Button answer2 = (Button) findViewById(R.id.answer2);
        answer2.setVisibility(View.VISIBLE);
        answer2.setText("Electronic Transfer Funds");
        Button answer3 = (Button) findViewById(R.id.answer3);
        answer3.setVisibility(View.VISIBLE);
        answer3.setText("Exchange Transfer Funds");
        Button answer4 = (Button) findViewById(R.id.answer4);
        answer4.setVisibility(View.VISIBLE);
        answer4.setText("Equity Transmission Funds");
    }
    public void end_game(){
        Button answer1 = (Button) findViewById(R.id.answer1);
        Button answer2 = (Button) findViewById(R.id.answer2);
        Button answer3 = (Button) findViewById(R.id.answer3);
        Button answer4 = (Button) findViewById(R.id.answer4);
        answer1.setVisibility(View.INVISIBLE);
        answer2.setVisibility(View.INVISIBLE);
        answer3.setText("Back to Main");
        answer4.setText("Redo Quiz");
        TextView QuestionText = (TextView) findViewById(R.id.text_question);
        QuestionText.setVisibility(View.INVISIBLE);
        TextView endPhrase = (TextView) findViewById(R.id.endPhrase);
        endPhrase.setVisibility(View.VISIBLE);
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        questionID.setVisibility(View.INVISIBLE);
        questionID.setText("EndGame");
        MainActivity.changePoints(4);


    }

    public void Answer1Click(View view){
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        System.out.println(questionID.getText());
        if(questionID.getText().equals("Question 1")){
            AlertDialog.Builder answerClue1 = CreateAnswer1(true);
            answerClue1.show();
        }
        else if(questionID.getText().equals("Question 2")){
            AlertDialog.Builder answerClue2 = CreateAnswer2(false);
            answerClue2.show();
        }
        else if(questionID.getText().equals("Question 3")){
            AlertDialog.Builder answerClue3 = CreateAnswer3(false);
            answerClue3.show();
        }
        else{

        }

    }
    public void Answer2Click(View view){
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        System.out.println(questionID.getText());
        if(questionID.getText().equals("Question 1")){
            AlertDialog.Builder answerClue1 = CreateAnswer1(false);
            answerClue1.show();
        }
        else if(questionID.getText().equals("Question 2")){
            AlertDialog.Builder answerClue2 = CreateAnswer2(true);
            answerClue2.show();
        }
        else if(questionID.getText().equals("Question 3")){
            AlertDialog.Builder answerClue3 = CreateAnswer3(false);
            answerClue3.show();
        }
        else{

        }

    }
    public void Answer3Click(View view){
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        System.out.println(questionID.getText());
        if(questionID.getText().equals("Question 1")){
            AlertDialog.Builder answerClue1 = CreateAnswer1(false);
            answerClue1.show();
        }
        else if(questionID.getText().equals("Question 2")){
            AlertDialog.Builder answerClue2 = CreateAnswer2(false);
            answerClue2.show();

        }
        else if(questionID.getText().equals("Question 3")){
            AlertDialog.Builder answerClue3 = CreateAnswer3(false);
            answerClue3.show();
        }
        else{
            Intent _result = new Intent();
            setResult(Activity.RESULT_OK, _result);
            finish();
        }

    }
    public void Answer4Click(View view){
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        System.out.println(questionID.getText());
        if(questionID.getText().equals("Question 1")){
            AlertDialog.Builder answerClue1 = CreateAnswer1(false);
            answerClue1.show();

        }
        else if(questionID.getText().equals("Question 2")){
            AlertDialog.Builder answerClue1 = CreateAnswer2(false);
            answerClue1.show();

        }
        else if(questionID.getText().equals("Question 3")){
            AlertDialog.Builder answerClue1 = CreateAnswer3(true);
            answerClue1.show();
        }
        else{
        }

    }

    public void setQ2(){
        TextView QuestionText = (TextView) findViewById(R.id.text_question);
        QuestionText.setText("What is NOT a type of mutual fund?");
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        questionID.setText("Question 2");
        Button answer1 = (Button) findViewById(R.id.answer1);
        answer1.setText("Fixed");
        Button answer2 = (Button) findViewById(R.id.answer2);
        answer2.setText("Trade Income");
        Button answer3 = (Button) findViewById(R.id.answer3);
        answer3.setText("Balanced Fund");
        Button answer4 = (Button) findViewById(R.id.answer4);
        answer4.setText("Mutual");
    }
    public void setQ3(){
        TextView QuestionText = (TextView) findViewById(R.id.text_question);
        QuestionText.setText("Where can you trade with CIBC?");
        TextView questionID = (TextView) findViewById(R.id.QuestionID);
        questionID.setText("Question 3");
        Button answer1 = (Button) findViewById(R.id.answer1);
        answer1.setText("In Branch");
        Button answer2 = (Button) findViewById(R.id.answer2);
        answer2.setText("Online");
        Button answer3 = (Button) findViewById(R.id.answer3);
        answer3.setText("Mobile");
        Button answer4 = (Button) findViewById(R.id.answer4);
        answer4.setText("All of the above");
    }

    public AlertDialog.Builder CreateAnswer1(boolean answer){
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        if(answer){
            builder.setTitle("Good Job!");
        }
        else{
            builder.setTitle("Almost! The correct answer is: Exchange-Traded Funds");
        }
        builder.setMessage("An ETF, or exchange-traded fund, is a marketable security that tracks an index, a commodity, bonds, or a basket of assets like an index fund.")
                .setPositiveButton("Cool!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        setQ2();                    }
                })
                .setIcon(android.R.drawable.btn_star);
        return builder;
    }

    public AlertDialog.Builder CreateAnswer2(boolean answer){
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        if(answer){
            builder.setTitle("Good Job!");
        }
        else{
            builder.setTitle("Almost! The correct answer is: Trade Funds");
        }
        builder.setMessage("Mutual funds may include investments in stocks, bonds, options, futures, currencies, treasuries and money market securities.")
                .setPositiveButton("Cool!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        setQ3();                    }
                })
                .setIcon(android.R.drawable.btn_star);
        return builder;
    }

    public AlertDialog.Builder CreateAnswer3(boolean answer){
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        if(answer){
            builder.setTitle("Good Job!");
        }
        else{
            builder.setTitle("Almost! The correct answer is: All of the Above!");
        }
        builder.setMessage(
                "With the CIBC Mobile Wealth App and the Investor’s Edge mobile website you can trade equities, access your accounts, get quotes and monitor the markets from wherever you are.")
                .setPositiveButton("Cool!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        end_game();                    }
                })
                .setIcon(android.R.drawable.btn_star);
        return builder;
    }


}
