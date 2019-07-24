package com.example.android.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pass extends AppCompatActivity {
    EditText lat,lng,date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
         lat = (EditText)findViewById(R.id.editText4);
        lng = (EditText)findViewById(R.id.editText5);
       date = (EditText)findViewById(R.id.editText6);

        Button but = (Button)findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent im = new Intent(pass.this,crime.class);
                im.putExtra("lat",lat.getText().toString());
                im.putExtra("lng",lng.getText().toString());
                im.putExtra("dat",date.getText().toString());
                startActivity(im);
            }
        });

    }
}
