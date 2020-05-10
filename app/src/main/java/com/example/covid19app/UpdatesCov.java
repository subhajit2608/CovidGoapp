package com.example.covid19app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UpdatesCov extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates_cov);
    }
    public void worldWide(View view) {
        Intent intent = new Intent(this, WorldWideCov.class);
        startActivity(intent);
    }

    public void acrossCities(View view) {
        Intent intent = new Intent(this, AcrossCity.class);
        startActivity(intent);
    }

}
