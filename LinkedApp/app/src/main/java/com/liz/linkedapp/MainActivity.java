package com.liz.linkedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Button niguse,songa;
  TextView shika;
  ImageView picha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        niguse = findViewById(R.id.btn1);
        songa = findViewById(R.id.btn2);
        shika = findViewById(R.id.tv1);
        picha = findViewById(R.id.img1);
        niguse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Umenigusa", Toast.LENGTH_SHORT).show();
            }
        });
        songa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tembea = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(tembea);
            }
        });
        picha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(move);
            }
        });
        shika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Umenishika", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
