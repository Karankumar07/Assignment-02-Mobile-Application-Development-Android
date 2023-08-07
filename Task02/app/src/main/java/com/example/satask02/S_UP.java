package com.example.satask02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class S_UP extends AppCompatActivity {
    TextView s;
    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup);
        s = findViewById(R.id.s_up);
        button = findViewById(R.id.button);
        String s_name = getIntent().getStringExtra("Name");
        String s_lastName = getIntent().getStringExtra("Last Name");
        String s_email = getIntent().getStringExtra("Email");
        String s_password = getIntent().getStringExtra("Password");
        s.setText("SignUP \nName: " + s_name + "\nLast Name: " + s_lastName + "\nEmail: " + s_email + "\nPassword: " + s_password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(S_UP.this,UserLogin.class);
                startActivity(intent);

            }
        });


    }
}
