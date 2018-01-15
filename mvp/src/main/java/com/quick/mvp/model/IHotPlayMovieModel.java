package com.quick.mvp.model;

import com.quick.mvp.bean.HotPlayMovie;

import java.util.List;

/**
 * Created by beike on 2018/1/15.
 */

public interface IHotPlayMovieModel {
    void loadData(ModelListener listener);

    interface ModelListener {
        void onComplete(HotPlayMovie data);
        void onError(Throwable t);
    }
}
