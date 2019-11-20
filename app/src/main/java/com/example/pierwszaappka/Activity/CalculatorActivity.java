package com.example.pierwszaappka.Activity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.pierwszaappka.Components.Calculator;
import com.example.pierwszaappka.R;

public class CalculatorActivity extends AppCompatActivity {

    private TextView calcResult;
    private String calcResultString = "";
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        calcResult = findViewById(R.id.calcResult);
        if (calcResultString.equals("")) {
            calcResult.setText("0");
        } else calcResult.setText(calcResultString);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void calcClick(View view) {
        calculator = new Calculator();
        calcResultString = calculator.onClick(view, calcResultString);
        onResume();

    }
}
