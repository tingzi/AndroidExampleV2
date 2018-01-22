package com.quick.mvvm.net;

import com.quick.mvvm.bean.HotPlayMovie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by beike on 2018/1/12.
 */

public interface Service {
    @GET("/PageSubArea/HotPlayMovies.api")
    Call<HotPlayMovie> getHotPlayMovie(@Query("locationId") int locationId);  // locationId=290
}
