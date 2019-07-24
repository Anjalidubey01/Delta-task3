package com.example.android.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView name,id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        name = (TextView)findViewById(R.id.textView);
        id = (TextView)findViewById(R.id.textView2);
        name.setText(getIntent().getStringExtra("name"));
        id.setText(getIntent().getStringExtra("id"));
    }
}
