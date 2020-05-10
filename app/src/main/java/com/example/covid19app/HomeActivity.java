package com.example.covid19app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       // Intent intent=getIntent();
    }

    public void predictChance(View view) {
        Intent intent = new Intent(this, PredictionActivity.class);
        startActivity(intent);
    }

    public void symptomsCov(View view) {
        Intent intent = new Intent(this, SymptomsActivity.class);
        startActivity(intent);
    }

    public void getContacts(View view) {
        Intent intent = new Intent(this, HealthExpertActivity.class);
        startActivity(intent);
    }
}


