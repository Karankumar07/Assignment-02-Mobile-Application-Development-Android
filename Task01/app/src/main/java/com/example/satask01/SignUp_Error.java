package com.example.satask01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SignUp_Error extends AppCompatActivity {
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_error);
        error = findViewById(R.id.error);
        error.setText(R.string.error);
    }
}