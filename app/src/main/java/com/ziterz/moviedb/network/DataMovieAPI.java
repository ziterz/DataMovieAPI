package com.ziterz.moviedb.network;

import com.ziterz.moviedb.data.DataMovie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by ziterz on 6/11/2017.
 */

public interface DataMovieAPI {

    @GET("3/movie/{movie_id}")
    Call<DataMovie> getDataMovie(@Path("movie_id") String movie_id,@Query("api_key") String api_key);
}
