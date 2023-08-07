package com.example.satask02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Logged extends AppCompatActivity {
    TextView logged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        logged = findViewById(R.id.logged);

        String email = getIntent().getStringExtra("Email");
        String password = getIntent().getStringExtra("Password");
        logged.setText("Logged In\nEmail: " + email + "\nPassword: " + password);

    }
}
