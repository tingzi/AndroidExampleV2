package com.quick.mvvm.model;

import com.quick.mvvm.bean.HotPlayMovie;

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
