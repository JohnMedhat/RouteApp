package com.example.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAndroid = findViewById(R.id.btn_android);
        Button buttonIos = findViewById(R.id.btn_ios);
        Button buttonFullstack = findViewById(R.id.btn_fullstack);
        Intent intent = new Intent(MainActivity.this,CoursesActivity.class);

        buttonAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("txt",R.string.android_content);
                intent.putExtra("img",R.drawable.android);

                startActivity(intent);
            }
        });

        buttonIos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("txt",R.string.ios_content);
                intent.putExtra("img",R.drawable.ios);

                startActivity(intent);
            }
        });

        buttonFullstack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("txt",R.string.fill_content);
                intent.putExtra("img",R.drawable.fullstack);

                startActivity(intent);
            }
        });
    }
}