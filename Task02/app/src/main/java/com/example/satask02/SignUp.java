package com.example.satask02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    EditText s_email, s_password, s_name, s_lastName;

    Button s_up, s_in;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        s_name = findViewById(R.id.et_1);
        s_lastName = findViewById(R.id.et_2);
        s_email = findViewById(R.id.et_3);
        s_password = findViewById(R.id.et_4);
        s_up = findViewById(R.id.bt_1);
        s_in = findViewById(R.id.bt_2);
        s_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = s_name.getText().toString().trim();
                String lastName = s_lastName.getText().toString().trim();
                String e = s_email.getText().toString().trim();
                String pas = s_password.getText().toString().trim();
                intent = new Intent(SignUp.this, S_UP.class);
                intent.putExtra("Name", name);
                intent.putExtra("Last Name", lastName);
                intent.putExtra("Email", e);
                intent.putExtra("Password", pas);
                startActivity(intent);
            }

        });
        s_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SignUp.this, UserLogin.class);
                startActivity(intent);
            }
        });
    }
}


