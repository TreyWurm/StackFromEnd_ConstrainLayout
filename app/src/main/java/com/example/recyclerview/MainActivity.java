package com.example.recyclerview;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        findViewById(R.id.tv_bugged).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BuggedActivity.startActivity(MainActivity.this);
            }
        });

        findViewById(R.id.tv_working).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WorkingActivity.startActivity(MainActivity.this);
            }
        });
    }
}
