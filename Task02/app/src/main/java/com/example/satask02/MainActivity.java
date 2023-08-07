package com.example.satask02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final int LOGO_DISPLAY_DURATION = 5000;
    ImageView img1;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            intent = new Intent(MainActivity.this, W_Screen.class);
            startActivity(intent);
        }
    }, LOGO_DISPLAY_DURATION);
    }
}