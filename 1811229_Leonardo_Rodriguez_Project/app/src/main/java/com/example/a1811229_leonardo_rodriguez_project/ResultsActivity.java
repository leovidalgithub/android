package com.example.a1811229_leonardo_rodriguez_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {

    ArrayList<String> resultList;
    TextView txtResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        this.resultList = new ArrayList<String>();
        this.txtResults = findViewById(R.id.textViewResults);
        showAllResults();
    }

    public void showAllResults() {
        this.txtResults.setText("");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.resultList = extras.getStringArrayList("key");
            String allResults = "";

            for (String result: this.resultList) {
                allResults += result;
            }
            this.txtResults.setText(allResults);
        }
    }

    public void btnGoBack_onClickEvent(View view) {
        finish();
    }
}
