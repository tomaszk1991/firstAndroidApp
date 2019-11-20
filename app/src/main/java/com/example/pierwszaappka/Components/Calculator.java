package com.example.pierwszaappka.Components;

import android.util.Log;
import android.view.View;

import com.example.pierwszaappka.R;

public class Calculator {


    public Calculator() {
    }


    public String onClick(View view, String calcResultString) {


        switch (view.getId()){
            case R.id.mcBtn:
            case R.id.mPlusBtn:
            case R.id.mMinusBtn:
            case R.id.mrBtn:
            case R.id.cBtn:
            case R.id.eraseBtn:
            case R.id.divideBtn:
            case R.id.multiplyBtn:
            case R.id.minusBtn:
            case R.id.plusBtn:
            case R.id.percentBtn:
            case R.id.commaBtn:
            case R.id.equalsBtn:
        }


        if (calcResultString.length() < 15) {
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
        return calcResultString;
    }
}
