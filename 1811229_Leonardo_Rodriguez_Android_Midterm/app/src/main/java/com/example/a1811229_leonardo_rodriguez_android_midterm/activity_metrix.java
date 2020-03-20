package com.example.a1811229_leonardo_rodriguez_android_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_metrix extends AppCompatActivity implements View.OnClickListener {

    private Button btnConvertion, btnReturn;
    private TextView txtKMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrix);
        initialise();
    }

    private void initialise() {
        this.btnConvertion = findViewById(R.id.btnMetrixConvertion);
        this.btnReturn = findViewById(R.id.btnKMSReturn);
        this.btnConvertion.setOnClickListener(this);
        this.btnReturn.setOnClickListener(this);
        this.txtKMS = findViewById(R.id.editTextKM);
    }

    @Override
    public void onClick(View view) {
        String result;
        String err_msg = getString(R.string.err_msg);

        switch (view.getId()) {
            case R.id.btnMetrixConvertion: {
                String kmsText = this.txtKMS.getText().toString();
                if (Utils.isNumeric(kmsText)) {
                    Double kms = Double.valueOf(kmsText);
                    Double meters = (kms / 0.001);
                    Log.d("ConvertingKMStoMeters","Result " + meters);
                    result = Utils.nf.format(kms) + " Kms = " + Utils.nf.format(meters) + " m";
                } else {
                    result = err_msg;
                }
                Toast.makeText(this, result, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btnKMSReturn: {
                finish();
                break;
            }
        }
    }
}
