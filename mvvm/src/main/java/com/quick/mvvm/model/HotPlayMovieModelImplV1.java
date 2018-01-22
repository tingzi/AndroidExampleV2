package com.quick.mvvm.model;

import com.quick.mvvm.bean.HotPlayMovie;
import com.quick.mvvm.net.Service;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by beike on 2018/1/15.
 */

public class HotPlayMovieModelImplV1 implements IHotPlayMovieModel, Callback<HotPlayMovie> {

    private ModelListener mListener;

    @Override
    public void onResponse(Call<HotPlayMovie> call, Response<HotPlayMovie> response) {
        if (null != mListener) {
            mListener.onComplete(response.body());
        }
    }

    @Override
    public void onFailure(Call<HotPlayMovie> call, Throwable t) {
        if (null != mListener) {
            mListener.onError(t);
        }
    }

    @Override
    public void loadData(ModelListener listener) {
        mListener = listener;
        new Retrofit.Builder()
                .baseUrl("https://api-m.mtime.cn")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Service.class)
                .getHotPlayMovie(290)
                .enqueue(this);
    }
}
