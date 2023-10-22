package com.leonstyven.mywater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
                Button loginButton = findViewById(R.id.login_button);
                loginButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Create an Intent to navigate to the Home Activity
                        Intent intent = new Intent(LogActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                });
            }

    }

