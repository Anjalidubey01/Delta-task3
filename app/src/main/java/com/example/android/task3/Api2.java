package com.example.android.task3;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api2 {
String BASE_URL2 = "https://data.police.uk/api/";
    @GET("crimes-at-location")
    Call<List<Model2>> getCrime(@Query("date")String date, @Query("lat")String lat, @Query("lng")String lng);
}
