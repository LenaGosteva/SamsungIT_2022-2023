package com.example.fooddeliveryapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        startActivity(new Intent(this, EnterActivity.class));
        super.onCreate(savedInstanceState);
        finish();
    }
}