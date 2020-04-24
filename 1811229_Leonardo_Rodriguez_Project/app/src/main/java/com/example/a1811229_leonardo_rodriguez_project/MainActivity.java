package com.example.a1811229_leonardo_rodriguez_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonMinus, buttonDot, buttonClear,
            buttonGenerate, buttonQuit, buttonEqual, buttonShowAll;
    EditText editTextResult;
    TextView txtGenerate;
    float value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonDot = findViewById(R.id.buttonDot);
        buttonClear = findViewById(R.id.buttonClear);
        buttonGenerate = findViewById(R.id.buttonGenerate);
        buttonQuit = findViewById(R.id.buttonQuit);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonShowAll = findViewById(R.id.buttonShowAll);

        editTextResult = findViewById(R.id.editTextResult);
        txtGenerate = findViewById(R.id.textViewGenerate);

    }
}
