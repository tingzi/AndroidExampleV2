package com.quick.androidexample.net;

import com.quick.androidexample.model.HotPlayMovie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by beike on 2018/1/12.
 */

public interface Service {
    @GET("/PageSubArea/HotPlayMovies.api?locationId=290")
    Call<HotPlayMovie> getHotPlayMovie(@Query("locationId")int locationId);
}
