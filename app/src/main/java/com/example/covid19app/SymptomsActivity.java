package com.example.covid19app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

public class SymptomsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
      //  Toast.makeText(this, "Please wait...", Toast.LENGTH_SHORT).show();
        Intent intent=getIntent();
    }
    public void knowCovFluCld(View view) {
        Intent intent = new Intent(this, CovFluCold.class);
        startActivity(intent);
    }
    public void ShowNearByDocs(View view){
        Intent intent= new Intent(this,GoogleMapsActivity.class);
        startActivity(intent);
    }
    public void updatesCov(View view){
        Intent intent= new Intent(this,UpdatesCov.class);
        startActivity(intent);
    }
}
