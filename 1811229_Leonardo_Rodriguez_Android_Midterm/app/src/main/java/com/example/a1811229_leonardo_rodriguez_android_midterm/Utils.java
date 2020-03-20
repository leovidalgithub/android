package com.example.a1811229_leonardo_rodriguez_android_midterm;

import android.content.res.Resources;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class Utils extends AppCompatActivity {

    public static NumberFormat nf = NumberFormat.getInstance();

//    public static String get_errMsg() {
//        return Resources.getSystem().getString(R.string.err_msg);
//    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
