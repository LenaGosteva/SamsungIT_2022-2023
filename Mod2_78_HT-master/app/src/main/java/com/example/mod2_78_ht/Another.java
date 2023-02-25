package com.example.mod2_78_ht;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Another extends AppCompatActivity {
    TextView text;
    Button back;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        back = findViewById(R.id.back);
        image = findViewById(R.id.photo);
        text = findViewById(R.id.plus);
        String email = getIntent().getStringExtra("email");
        text.setText("Hello, "+ email + "!");

        back.setOnClickListener(b -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode == RESULT_OK){
            switch (requestCode){
                case 1:
                    Bitmap photo = (Bitmap) intent.getExtras().get("data");
                    image.setImageBitmap(photo);
                    break;
            }
        }
    }
}