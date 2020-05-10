package com.example.covid19app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {
    EditText emailID;
    EditText PasswordT;
    Button signUpBtn;
    Button askLoginBtn;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

      //  Intent homeIntent=getIntent();

        emailID=findViewById(R.id.emailText);
        PasswordT=findViewById(R.id.passwordText);
        signUpBtn=findViewById(R.id.signupBtn);
        askLoginBtn=findViewById(R.id.askLogin);

        askLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this,LoginActivity.class));

            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailID.getText().toString();
                String password = PasswordT.getText().toString();
                firebaseAuth = FirebaseAuth.getInstance();

                if (email.isEmpty()){
                    emailID.setError("Please enter your Email ID");
                    emailID.requestFocus();
                }
                else if (password.isEmpty()){
                    PasswordT.setError("Please enter your password");
                    PasswordT.requestFocus();
                }
                else {//if (!email.isEmpty() && !password.isEmpty()){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(SignUpActivity.this, "SignUp successfull...", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUpActivity.this,HomeActivity.class));
                            }
                            else{
                                Toast.makeText(SignUpActivity.this, "SignUp failed", Toast.LENGTH_SHORT).show();
                               // startActivity(new Intent(SignUpActivity.this,HomeActivity.class));

                            }
                        }
                    });
                }
            }
        });

    }
}
