package com.example.android_num9_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Button_one = (Button)findViewById(R.id.button_one);
        Button_one.setOnClickListener(Number1);

        Button Button_two = (Button)findViewById(R.id.button_two);
        Button_two.setOnClickListener(Number2);

        Button Button_three = (Button)findViewById(R.id.button_three);
        Button_three.setOnClickListener(Number3);

        Button Button_four = (Button)findViewById(R.id.button_four);
        Button_four.setOnClickListener(Number4);

        Button Button_five = (Button)findViewById(R.id.button_five);
        Button_five.setOnClickListener(Number5);

        Button Button_six = (Button)findViewById(R.id.button_six);
        Button_six.setOnClickListener(Number6);

        Button Button_seven = (Button)findViewById(R.id.button_seven);
        Button_seven.setOnClickListener(Number7);

        Button Button_eight = (Button)findViewById(R.id.button_eight);
        Button_eight.setOnClickListener(Number8);

        Button Button_nine = (Button)findViewById(R.id.button_nine);
        Button_nine.setOnClickListener(Number9);

        Button Button_again = (Button)findViewById(R.id.again);
        Button_again.setOnClickListener(Again);
    }
    private View.OnClickListener Number1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("1");
        }
    };
    private View.OnClickListener Number2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("2");
        }
    };
    private View.OnClickListener Number3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("3");
        }
    };
    private View.OnClickListener Number4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("4");
        }
    };
    private View.OnClickListener Number5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("5");
        }
    };
    private View.OnClickListener Number6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("6");
        }
    };
    private View.OnClickListener Number7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("7");
        }
    };
    private View.OnClickListener Number8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("8");
        }
    };
    private View.OnClickListener Number9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.any_number);
            number.setText("9");
        }
    };
    private View.OnClickListener Again = new View.OnClickListener() {
        @Override

        public void onClick(View v) {
            int count = 0;
        }
    };


    public void click_out(View v){

        TextView Any_number = (TextView)findViewById(R.id.any_number);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("NUMBER", Any_number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}