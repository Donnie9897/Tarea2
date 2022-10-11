 package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

 public class MainActivity extends AppCompatActivity {

    private Switch strg_swt;
    private Switch loc_swt;
    private Switch cam_swt;
    private Switch pho_swt;
    private Switch contc_swt;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strg_swt = (Switch) findViewById(R.id.switch1);
        loc_swt = (Switch) findViewById(R.id.switch2);
        cam_swt = (Switch) findViewById(R.id.switch3);
        pho_swt = (Switch) findViewById(R.id.switch4);
        contc_swt = (Switch) findViewById(R.id.switch5);

        button1 = (Button) findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                if(strg_swt.isChecked())
                    intent.putExtra("STORAGE", "STORAGE");

                if(loc_swt.isChecked())
                    intent.putExtra("LOCATION", "LOCATION");

                if(cam_swt.isChecked())
                    intent.putExtra("CAMERA", "CAMERA");

                if(pho_swt.isChecked())
                    intent.putExtra("PHONE", "PHONE");

                if(contc_swt.isChecked())
                    intent.putExtra("CONTACTS", "CONTACTS");


                startActivity(intent);
            }
        });

    }
}