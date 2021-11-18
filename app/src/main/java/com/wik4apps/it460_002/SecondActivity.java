package com.wik4apps.it460_002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.second_textView);
        Intent intent = getIntent();
        if(intent!=null){
            String name = intent.getStringExtra("NAME");
            String greeting = intent.getStringExtra("GR");
            tv.setText(String.format("%s   %s", greeting, name));
        }

    }
}