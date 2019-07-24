package com.example.android.task3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "https://data.police.uk/api/";

    @GET("entries/en/")
    Call<ArrayList<model>> getforces();
}
