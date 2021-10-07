package com.example.control.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.control.R;
import com.example.control.roomdatabase.DatabaseConfig;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView forgotPasswordLink = (TextView) findViewById(R.id.forgotPasswordLink);
        MaterialButton loginMainButton = (MaterialButton) findViewById(R.id.loginMainButton);

        forgotPasswordLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotPasswordPage = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(forgotPasswordPage);
            }
        });

        loginMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dashboardPage = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(dashboardPage);
            }
        });
    }
}