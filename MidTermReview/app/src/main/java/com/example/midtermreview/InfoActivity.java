package com.example.midtermreview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDisplay, btnReturn;
    EditText editTextName, editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initialise();
    }

    private void initialise() {
        btnDisplay = findViewById(R.id.btnDisplay);
        btnReturn = findViewById(R.id.btnReturn);
        btnDisplay.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
        editTextAge = findViewById(R.id.editTextAge);
        editTextName = findViewById(R.id.editTextName);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDisplay: {
                String name = editTextName.getText().toString();
                String age = editTextAge.getText().toString();
                Log.d("Display","Name " + name);

                String info = "Name " + name + " Age " + age;
                Toast.makeText(this, info, Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btnReturn: {
                finish();
                break;
            }
        }
    }
}
