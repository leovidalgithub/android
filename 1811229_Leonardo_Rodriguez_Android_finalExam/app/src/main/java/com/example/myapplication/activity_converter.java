package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class activity_converter extends AppCompatActivity {

    private Toolbar toolbar;
    private Spinner spinnerCurrency;
    private TextView txtEuro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        this.txtEuro = findViewById(R.id.etEuro);
        this.toolbar = findViewById(R.id.toolbar);
        this.toolbar.setTitle(R.string.app_name);

        this.spinnerCurrency = (Spinner) findViewById(R.id.spinnerCurrency);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(activity_converter.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.currencies));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinnerCurrency.setAdapter(myAdapter);
    }

    public void btnConvertEvent(View view) {
        String euroText = this.txtEuro.getText().toString();

        if (!isNumericAndDouble(euroText)) {
            Toast.makeText(activity_converter.this, "Oops! The number introduced is not correct!",Toast.LENGTH_LONG).show();
            return;
        }

        String result = "Oops! No result.";
        String selectedCurrency = spinnerCurrency.getSelectedItem().toString();
        switch (selectedCurrency) {
            case "Dollar":
                result = "Dollar = $" + nf.format(Double.valueOf(euroText) * 1.09);
                break;
            case "Yen":
                result = "Yen = Y" + nf.format(Double.valueOf(euroText) * 118.52);
                break;
            case "Real":
                result = "Brasilian Real = " + nf.format(Double.valueOf(euroText) * 5.55);
                break;
        }
        Toast.makeText(activity_converter.this, result,Toast.LENGTH_LONG).show();
    }

    public static boolean isNumericAndDouble(String strNum) {
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
    public static NumberFormat nf = NumberFormat.getInstance();

}
