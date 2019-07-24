package com.example.android.task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class crime extends AppCompatActivity {
    List<Model2>userList;
   TextView crime;
   RecyclerView recyclerView;
   EditText lat,lng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        crime=(TextView)findViewById(R.id.textView6) ;
      recyclerView = (RecyclerView)findViewById(R.id.recyclerView2) ;
        getCrime();
    }

    private void getCrime() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api2.BASE_URL2)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();
        Api2 api2 = retrofit.create(Api2.class);
        Call<List<Model2>> call2 = api2.getCrime(getIntent().getStringExtra("dat"),getIntent().getStringExtra("lat"),getIntent().getStringExtra("lng"));
        call2.enqueue(new Callback<List<Model2>>() {
            @Override
            public void onResponse(Call<List<Model2>> call, Response<List<Model2>> response) {
                userList = response.body();
                //crime.setText(userList.getCategory());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(crime.this);
                recyclerView.setLayoutManager(linearLayoutManager);
                userListAdapter usersAdapter = new userListAdapter(crime.this, userList);
                recyclerView.setAdapter(usersAdapter);

            }

            @Override
            public void onFailure(Call<List<Model2>>call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
