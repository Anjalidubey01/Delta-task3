package com.example.android.task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class crime_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_details);
        TextView text = (TextView)findViewById(R.id.textView5);
        text.setText("Category:"+getIntent().getStringExtra("nam"));
        TextView loc = (TextView)findViewById(R.id.textView6);
        loc.setText("Location:"+getIntent().getStringExtra("location"));
        TextView per = (TextView)findViewById(R.id.textView7);
        per.setText("Persistent id:"+getIntent().getStringExtra("persistent"));
        TextView sub = (TextView)findViewById(R.id.textView8);
        sub.setText("Location SubType:"+getIntent().getStringExtra("locasub"));
        TextView mon = (TextView)findViewById(R.id.textView9);
        mon.setText("Year & Date:"+getIntent().getStringExtra("i"));


    }
}
