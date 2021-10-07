package com.example.control.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.control.R;
import com.example.control.roomdatabase.DatabaseConfig;
import com.example.control.roomdatabase.UserRegistration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {

    DatabaseConfig databaseConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        databaseConfig = DatabaseConfig.databaseGetInstance(SignUpActivity.this);

        TextInputEditText signUpUsernameText = (TextInputEditText) findViewById(R.id.signUpUsernameText);
        TextInputEditText signUpPasswordText = (TextInputEditText) findViewById(R.id.signUpPasswordText);
        TextInputEditText signUpEmailText = (TextInputEditText) findViewById(R.id.signUpEmailText);

        MaterialButton signUpMainButton = (MaterialButton) findViewById(R.id.signUpMainButton);

        signUpMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = signUpUsernameText.getText().toString();
                String password = signUpPasswordText.getText().toString();
                String email = signUpEmailText.getText().toString();
                databaseConfig.userRegistrationDao().insertData(new UserRegistration(username,email,password));

                Toast.makeText(SignUpActivity.this, "registered successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}