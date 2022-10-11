package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txt_1;
    private TextView txt_2;
    private TextView txt_3;
    private TextView txt_4;
    private TextView txt_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt_1 = findViewById(R.id.view);
        txt_2 = findViewById(R.id.view1);
        txt_3 = findViewById(R.id.view2);
        txt_4 = findViewById(R.id.view3);
        txt_5 = findViewById(R.id.view4);

        String storage = getIntent().getStringExtra("STORAGE");
        txt_1.setText(storage);

        String location = getIntent().getStringExtra("LOCATION");
        txt_2.setText(location);

        String camera = getIntent().getStringExtra("CAMERA");
        txt_3.setText(camera);

        String phone = getIntent().getStringExtra("PHONE");
        txt_4.setText(phone);

        String contacts = getIntent().getStringExtra("CONTACTS");
        txt_5.setText(contacts);
    }
}