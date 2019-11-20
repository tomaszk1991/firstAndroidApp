package com.example.pierwszaappka.Activity;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.pierwszaappka.R;

public class CalculatorActivity extends AppCompatActivity {

    private TextView calcResult;
    private String calcResultString="";
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

        calcResult=findViewById(R.id.calcResult);
        if (calcResultString.equals("")){
            calcResult.setText("0");
        }
        else calcResult.setText(calcResultString);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void calcClick(View view) {

        if (calcResultString.length()<15) {
            switch (view.getId()) {

                case R.id.zeroBtn:
                    calcResultString += "0";
                    break;
                case R.id.oneBtn:
                    calcResultString += "1";
                    break;
                case R.id.twoBtn:
                    calcResultString += "2";
                    break;
                case R.id.threeBtn:
                    calcResultString += "3";
                    break;
                case R.id.fourBtn:
                    calcResultString += "4";
                    break;
                case R.id.fiveBtn:
                    calcResultString += "5";
                    break;
                case R.id.sixBtn:
                    calcResultString += "6";
                    break;
                case R.id.sevenBtn:
                    calcResultString += "7";
                    break;
                case R.id.eightBtn:
                    calcResultString += "8";
                    break;
                case R.id.nineBtn:
                    calcResultString += "9";
                    break;

                default:
                    Log.d("guzik", "nieprzypisany guzik" + view.getId());
                    break;
            }
        }






        onResume();

    }
}
