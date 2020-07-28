package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDot;
    private Button buttonEquals;
    private Button buttonClr;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonMinus;
    private Button buttonPlus;

    private EditText mainView;
    private TextView secondaryView;

    private int sum = 0;
    private String mainTxt;
    private String secondaryTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //taking buttons for coding
        button0 = findViewById(R.id.b0);
        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        button3 = findViewById(R.id.b3);
        button4 = findViewById(R.id.b4);
        button5 = findViewById(R.id.b5);
        button6 = findViewById(R.id.b6);
        button7 = findViewById(R.id.b7);
        button8 = findViewById(R.id.b8);
        button9 = findViewById(R.id.b9);
        buttonDot = findViewById(R.id.bDot);
        buttonEquals = findViewById(R.id.bEquals);
        buttonClr = findViewById(R.id.bClr);
        buttonDivide = findViewById(R.id.bDivide);
        buttonMultiply = findViewById(R.id.bMultiply);
        buttonMinus = findViewById(R.id.bMinus);
        buttonPlus = findViewById(R.id.bPlus);

        mainView = findViewById(R.id.typeView);
        secondaryView = findViewById(R.id.sumView);

        mainTxt = "";
        mainView.setText(mainTxt);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt= mainTxt + "0";
                mainView.setText(mainTxt);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="1";
                mainView.setText(mainTxt);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="2";
                mainView.setText(mainTxt);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="3";
                mainView.setText(mainTxt);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="4";
                mainView.setText(mainTxt);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="5";
                mainView.setText(mainTxt);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="6";
                mainView.setText(mainTxt);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="7";
                mainView.setText(mainTxt);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="8";
                mainView.setText(mainTxt);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainTxt+="9";
                mainView.setText(mainTxt);
            }
        });
    }
}
