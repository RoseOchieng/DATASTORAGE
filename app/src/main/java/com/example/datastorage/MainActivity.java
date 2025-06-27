package com.example.datastorage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Assuming you have activity_main.xml

        Button settingsButton = findViewById(R.id.settingsButton);
        Button userRegistrationButton = findViewById(R.id.userRegistrationButton);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AtomicReference<Intent> intent = new AtomicReference<>(new Intent(MainActivity.this, com.example.datastorage.SettingsActivity.class));
                startActivity(intent.get());
            }
        });

        userRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserRegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}