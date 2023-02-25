package com.example.fooddeliveryapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.example.fooddeliveryapp.Adapters.EnterAdapterActivity;
import com.example.fooddeliveryapp.R;
import com.example.fooddeliveryapp.databinding.ActivityEnterBinding;

public class EnterActivity extends AppCompatActivity {

    ActivityEnterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityEnterBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        new Thread(()->{
            try {
                Thread.sleep(1000);
                runOnUiThread(()->{
                    binding.icon.setVisibility(View.VISIBLE);
                });

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        binding.pager.setAdapter(new EnterAdapterActivity(getSupportFragmentManager()));
        binding.tabs.setupWithViewPager(binding.pager);
    }
}