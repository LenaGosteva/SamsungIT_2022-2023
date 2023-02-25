package com.example.mod2_9_ht;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Comment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        Button button = findViewById(R.id.back);
        button.setOnClickListener(b ->{
            finish();
        });
    }
}