package com.example.mod2_9_ht;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    Adapter adapter;

    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;
    public static ArrayList<New> news= new ArrayList<New>(){};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.re);

        news.add(new New("Просто новость", R.drawable.img, 100));
        news.add(new New("Это цветок", R.drawable.img_2, 10));
        news.add(new New("Куча квадратов", R.drawable.img_1, -10));
        news.add(new New("Феерия цвета", R.drawable.img_3, 33));
        news.add(new New("Что-то непонятное", R.drawable.img_4, 50));
        news.add(new New("Взрыв", R.drawable.img_5, 5));


        adapter = new Adapter(news, MainActivity.this);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}