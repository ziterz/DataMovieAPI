package com.ziterz.moviedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ziterz.moviedb.data.DataMovie;
import com.ziterz.moviedb.data.Results;
import com.ziterz.moviedb.network.DataMovieAPI;
import com.ziterz.moviedb.network.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Results> resultsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultsArrayList = new ArrayList<>();

        DataMovieAPI api = RetrofitClient.getRetrofit().create(DataMovieAPI.class);

        String movie_id = "popular";
        String api_key = "5ecafcd6b64015065d4d58ba9837b7e0";

        Call<DataMovie> dataMovieCall = api.getDataMovie(movie_id,api_key);

        dataMovieCall.enqueue(new Callback<DataMovie>() {
            @Override
            public void onResponse(Call<DataMovie> call, Response<DataMovie> response) {
                if (response.isSuccessful()) {
                    Log.d("MainActivity","onResponse: success");
                    DataMovie dataMovie = response.body();
                    resultsArrayList.addAll(dataMovie.getResults());
                    Log.d("MainActivity", "onResponse: title: " + resultsArrayList.get(0).getTitle());
                }else {
                    Log.d("MainActivity","onResponse: not success");
                }
            }

            @Override
            public void onFailure(Call<DataMovie> call, Throwable t) {

            }
        });
    }
}
