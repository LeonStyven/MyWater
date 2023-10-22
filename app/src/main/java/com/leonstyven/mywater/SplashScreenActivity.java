package com.leonstyven.mywater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        int delayMillis = 4000; // Define the delay in milliseconds

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the HomeActivity
                Intent intent = new Intent(SplashScreenActivity.this, LogActivity.class);
                startActivity(intent);
                finish(); // Finish the current activity
            }
        }, delayMillis);
    }
}
