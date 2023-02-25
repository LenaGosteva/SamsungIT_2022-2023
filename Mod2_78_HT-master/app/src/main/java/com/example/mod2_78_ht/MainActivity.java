package com.example.mod2_78_ht;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button out;
    TextView parol, email;
    boolean p = false, e = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parol = findViewById(R.id.parol);
        out = findViewById(R.id.out);
        email = findViewById(R.id.email);


        out.setOnClickListener(ck->{
            boolean s = false;
            for (char i : email.getText().toString().toCharArray()){
                if (i =='@') e = true;
            }
            if (!e)  Toast.makeText(this, "Почта должна содержать символ '@'", Toast.LENGTH_SHORT).show();
            if (parol.getText().toString().length() <= 8){

            Toast.makeText(this, "Пароль должен быть больше 8 символов", Toast.LENGTH_SHORT).show();
        }
        else {
            p = true;
            parol.setBackgroundColor(getResources().getColor(R.color.teal_200));
        }
            if (e && p) {
                Intent intent = new Intent(getApplicationContext(), Another.class);
                intent.putExtra("email", email.getText().toString());
                startActivity(intent);
                finish();
            }
            else Toast.makeText(this, "Вы не можете зарегестрироваться", Toast.LENGTH_SHORT).show();
        });
    }
}

