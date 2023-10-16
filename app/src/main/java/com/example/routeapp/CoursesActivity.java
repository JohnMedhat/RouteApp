package com.example.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        ImageView imageView = findViewById(R.id.iv_image);
        TextView tv_content = findViewById(R.id.tv_content);
        getIntent().getIntExtra("txt",-1);
        getIntent().getIntExtra("img",-1);

        imageView.setImageDrawable(getDrawable(getIntent().getIntExtra("img",-1)));
        tv_content.setText(getText(getIntent().getIntExtra("txt",-1)));
    }
}