package com.example.satask01;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserLogin extends AppCompatActivity {
    EditText email;
    EditText password;
    Button login, signup;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        email = findViewById(R.id.edt_1);
        password = findViewById(R.id.edt_2);
        login = findViewById(R.id.btn_2);
        signup = findViewById(R.id.btn_3);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em = email.getText().toString().trim();
                String pass = password.getText().toString().trim();
                if (isUserSignedUp(em, pass)) {
                    intent = new Intent(UserLogin.this, Logged.class);
                    intent.putExtra("Email", em);
                    intent.putExtra("Password", pass);
                    startActivity(intent);
                }
                else {
                    intent = new Intent(UserLogin.this, LoginError.class);
                    startActivity(intent);
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(UserLogin.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
    boolean isUserSignedUp(String em, String pass) {
        String validEmail = "karanmalhi789@gmail.com";
        String validPassword = "password123";

        return validEmail.equals(validEmail) && validPassword.equals(validPassword);


    }
}




