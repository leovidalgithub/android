package com.example.a1811229_leonardo_rodriguez_android_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_temper extends AppCompatActivity implements View.OnClickListener {

    private Button btnConvertion, btnReturn;
    private TextView txtCelcius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temper);
        initialise();
    }

    private void initialise() {
        this.btnConvertion = findViewById(R.id.btnTemperConvertion);
        this.btnReturn = findViewById(R.id.btnTemperReturn);
        this.btnConvertion.setOnClickListener(this);
        this.btnReturn.setOnClickListener(this);
        this.txtCelcius = findViewById(R.id.editTextCelcius);
    }

    @Override
    public void onClick(View view) {
        String result;
        String err_msg = getString(R.string.err_msg);

        switch (view.getId()) {
           case R.id.btnTemperConvertion: {
               String celciusText = this.txtCelcius.getText().toString();
               if (Utils.isNumeric(celciusText)) {
                   Double celcius = Double.valueOf(celciusText);
                   Double fahrenheit = (celcius * 1.8) + 32;
                   Log.d("ConvertingCeltoFah","Result " + fahrenheit);
                   result = "Cel = " + Utils.nf.format(celcius) + " / Fah = " + Utils.nf.format(fahrenheit);
               } else {
                   result = err_msg;
                }
                Toast.makeText(this, result, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btnTemperReturn: {
                finish();
                break;
            }
        }
    }
}
