package com.example.a1811229_leonardo_rodriguez_android_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class activity_start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void btnTemperClickEvent(View view) {
        startActivity(new Intent(activity_start.this, activity_temper.class));
    }
    public void btnMetrixClickEvent(View view) {
        startActivity(new Intent(activity_start.this, activity_metrix.class));
    }
    public void btnEndClickEvent(View view) {
        finish();
    }

}
