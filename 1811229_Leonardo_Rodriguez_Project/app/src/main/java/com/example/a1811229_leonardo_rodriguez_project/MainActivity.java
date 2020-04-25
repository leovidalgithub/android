package com.example.a1811229_leonardo_rodriguez_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.a1811229_leonardo_rodriguez_project.Models.Calculator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonMinus, buttonDot, buttonClear,
            buttonGenerate, buttonQuit, buttonEqual, buttonShowAll;
    EditText editTextResult;
    TextView txtGenerate;
    Calculator calc;
    ArrayList<String> resultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
    }

    private void initialise() {
        this.calc = new Calculator();
        this.resultList = new ArrayList<String>();

        this.button0 = findViewById(R.id.button0);
        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.button5 = findViewById(R.id.button5);
        this.button6 = findViewById(R.id.button6);
        this.button7 = findViewById(R.id.button7);
        this.button8 = findViewById(R.id.button8);
        this.button9 = findViewById(R.id.button9);
        this.buttonMinus = findViewById(R.id.buttonMinus);
        this.buttonDot = findViewById(R.id.buttonDot);
        this.buttonClear = findViewById(R.id.buttonClear);
        this.buttonGenerate = findViewById(R.id.buttonGenerate);
        this.buttonQuit = findViewById(R.id.buttonQuit);
        this.buttonEqual = findViewById(R.id.buttonEqual);
        this.buttonShowAll = findViewById(R.id.buttonShowAll);

        this.button0.setOnClickListener(this);
        this.button1.setOnClickListener(this);
        this.button2.setOnClickListener(this);
        this.button3.setOnClickListener(this);
        this.button4.setOnClickListener(this);
        this.button5.setOnClickListener(this);
        this.button6.setOnClickListener(this);
        this.button7.setOnClickListener(this);
        this.button8.setOnClickListener(this);
        this.button9.setOnClickListener(this);
        this.buttonMinus.setOnClickListener(this);
        this.buttonDot.setOnClickListener(this);
        this.buttonClear.setOnClickListener(this);
        this.buttonGenerate.setOnClickListener(this);
        this.buttonQuit.setOnClickListener(this);
        this.buttonEqual.setOnClickListener(this);
        this.buttonShowAll.setOnClickListener(this);

        this.editTextResult = findViewById(R.id.editTextResult);
        this.txtGenerate = findViewById(R.id.textViewGenerate);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonGenerate: {
                int randNumber1 = calc.giveMeRandomNumber();
                int randNumber2 = calc.giveMeRandomNumber();
                char operator = calc.giveMeRandomOperator();
                this.txtGenerate.setText(randNumber1 + " " + operator + " " + randNumber2);
                this.editTextResult.setText("Enter the result here");
                break;
            }
            case R.id.buttonClear: {
                this.editTextResult.setText("Enter the result here");
                break;
            }
            case R.id.buttonQuit: {
                finish();
                break;
            }
            case R.id.buttonEqual: {
                try {
                    String currentOperation = this.txtGenerate.getText().toString();
                    if (!currentOperation.contains("appear")) {
                        String userResult = this.editTextResult.getText().toString();
                        double result = Utils.eval(currentOperation);
                        String machineResult = "Result = " + Utils.resultFormatted(result);
                        this.editTextResult.setText(machineResult);
                        String resultMessage = machineResult + "\nYour Answer is ";
                        if (Double.parseDouble(userResult) == result) {
                            resultMessage += "Correct!";
                        } else {
                            resultMessage += "Wrong!";
                        }
                        Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show();
                        resultMessage += "\n-----------------------\n";
                        this.resultList.add(resultMessage);
                    }
                } catch (Exception e) {
                    this.editTextResult.setText("Oops! We got an Error");
                }
                break;
            }
            case R.id.buttonShowAll: {
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                intent.putExtra("key", this.resultList);
                startActivity(intent);
                break;
            }
            case R.id.button0: {
                showResult('0');
                break;
            }
            case R.id.button1: {
                showResult('1');
                break;
            }
            case R.id.button2: {
                showResult('2');
                break;
            }
            case R.id.button3: {
                showResult('3');
                break;
            }
            case R.id.button4: {
                showResult('4');
                break;
            }
            case R.id.button5: {
                showResult('5');
                break;
            }
            case R.id.button6: {
                showResult('6');
                break;
            }
            case R.id.button7: {
                showResult('7');
                break;
            }
            case R.id.button8: {
                showResult('8');
                break;
            }
            case R.id.button9: {
                showResult('9');
                break;
            }
            case R.id.buttonMinus: {
                showResult('-');
                break;
            }
            case R.id.buttonDot: {
                showResult('.');
                break;
            }
        }
    }
    private void showResult(char charToShow) {
        String currentResult = this.editTextResult.getText().toString();
        if (currentResult.contains("Enter")) currentResult = "";
        currentResult += charToShow;
        this.editTextResult.setText(currentResult);
    }
}
