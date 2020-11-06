package com.example.android_num9_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Number_Answer();
    }
    //返回上一頁
    public void click_back(View v){
        finish();
    }
    private void Number_Answer(){
        int number;

        Random Number = new Random();
        int Answer = Number.nextInt((5)+4);
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null){

            number = Integer.parseInt(bundle.getString("NUMBER"));
            TextView TrueOrFalse= (TextView)findViewById(R.id.TrueOrFalse);
            TextView BigOrSmall = (TextView)findViewById(R.id.BigOrSmall);

            if (number == Answer){
                BigOrSmall.setText("Bingo");
                TrueOrFalse.setText("○");

            }
            else if (number > Answer){
                BigOrSmall.setText("Guess Small");
                TrueOrFalse.setText("X");

            }
            else if (number < Answer){
                BigOrSmall.setText("Guess Big");
                TrueOrFalse.setText("X");
            }
        }
    }
}