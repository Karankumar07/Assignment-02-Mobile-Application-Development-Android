package com.example.satask01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int LOGO_DISPLAY_DURATION = 5000;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.logo);
        text = findViewById(R.id.text_1);

        img.setVisibility(View.VISIBLE);
        text.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(() -> {
            text.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> {
                text.setVisibility(View.INVISIBLE);
                startActivity(new Intent(MainActivity.this, UserLogin.class));
                finish();
            }, LOGO_DISPLAY_DURATION);
        }, LOGO_DISPLAY_DURATION);

    }
}
