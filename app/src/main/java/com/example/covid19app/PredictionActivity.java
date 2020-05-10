package com.example.covid19app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class PredictionActivity extends AppCompatActivity {

   private EditText name,age,nationality,state,leave,visited,disease;
   private Button insert;
   // FirebaseDatabase database;
   // DatabaseReference ref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction);

        Intent intent=getIntent();

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        nationality=findViewById(R.id.nationality);
        state=findViewById(R.id.state);
        leave=findViewById(R.id.leave);
        visited=findViewById(R.id.visited);
        disease=findViewById(R.id.disease);
        insert=findViewById(R.id.proceed);
      //  database=FirebaseDatabase.getInstance();
      //  ref=database.getReference("User")
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String,Object> map=new HashMap<>();
                map.put("Name",name.getText().toString());
                map.put("Age",age.getText().toString());
                map.put("Nationality",nationality.getText().toString());
                map.put("Name of your State",state.getText().toString());
                map.put("Number of outings",leave.getText().toString());
                map.put("Name of the state or country visited",visited.getText().toString());
                map.put("Health status",disease.getText().toString());


                FirebaseDatabase.getInstance().getReference().child("USER").push().setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Log.i("complete","onComplete");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("failed","onFailure"+e.toString());
                    }
                });
            }
        });

    }
    public void showPredict(View view) {
        Intent intent = new Intent(this, ShowPredictActivity.class);
        startActivity(intent);
    }

}
