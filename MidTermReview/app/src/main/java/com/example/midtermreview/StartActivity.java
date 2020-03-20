package com.example.midtermreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

//        Button mBtnInfo = findViewById(R.id.btnInfo);
//        mBtnInfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(StartActivity.this, InfoActivity.class));
//            }
//        });
    }

    public void btnInfo_onClickEvent(View view) {
        startActivity(new Intent(StartActivity.this, InfoActivity.class));
    }
}
