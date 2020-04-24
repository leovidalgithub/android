package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ProgressBar progressBar;
    private EditText email;
    private EditText password;
    private Button btnSignin;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.toolbar = findViewById(R.id.toolbar);
        this.progressBar = findViewById(R.id.progressBar);
        this.email = findViewById(R.id.etEmail);
        this.password = findViewById(R.id.etPassword);
        this.btnSignin = findViewById(R.id.btnSignin);
        this.toolbar.setTitle(R.string.app_name);
        this.mAuth = FirebaseAuth.getInstance();

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            progressBar.setVisibility(View.VISIBLE);
                mAuth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString())
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.INVISIBLE);
                                if (task.isSuccessful()) { // Sign in success
                                    Toast.makeText(MainActivity.this, "Authentication success***!",Toast.LENGTH_LONG).show();
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    startActivity(new Intent(MainActivity.this, activity_converter.class));
                                } else { // Sign in fails
                                    Toast.makeText(MainActivity.this, "Authentication failed.",Toast.LENGTH_LONG).show();
                                }
                            }
                        });
//                mAuth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString())
//                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (task.isSuccessful()) {
//                                    FirebaseUser user = mAuth.getCurrentUser();
//                                    Toast.makeText(MainActivity.this, "Authentication success!",Toast.LENGTH_LONG).show();
//                                } else {
//                                    Toast.makeText(MainActivity.this, "Authentication failed.",Toast.LENGTH_LONG).show();
//                                }
//                            }
//                        });
            }
        });
    }
}


