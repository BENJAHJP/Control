package com.example.control.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.control.R;
import com.google.android.material.button.MaterialButton;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        MaterialButton loginButtonWelcome = (MaterialButton) findViewById(R.id.loginButtonWelcome);
        MaterialButton signUpButtonWelcome = (MaterialButton) findViewById(R.id.signUpButtonWelcome);

        loginButtonWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginPage = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(loginPage);
            }
        });

        signUpButtonWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUpPage = new Intent(WelcomeActivity.this, SignUpActivity.class);
                startActivity(signUpPage);
            }
        });
    }
}