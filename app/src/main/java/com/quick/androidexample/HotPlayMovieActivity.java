package com.quick.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.quick.androidexample.model.HotPlayMovie;
import com.quick.androidexample.net.Service;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by beike on 2018/1/12.
 */

public class HotPlayMovieActivity extends Activity implements Callback<HotPlayMovie> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Service service = retrofit.create(Service.class);
        Call<HotPlayMovie> hotPlayMovie = service.getHotPlayMovie(290);
        hotPlayMovie.enqueue(this);


    }

    @Override
    public void onResponse(Call<HotPlayMovie> call, Response<HotPlayMovie> response) {

    }

    @Override
    public void onFailure(Call<HotPlayMovie> call, Throwable t) {
        t.printStackTrace();
    }
}
