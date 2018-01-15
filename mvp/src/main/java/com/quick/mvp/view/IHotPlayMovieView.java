package com.quick.mvp.view;

import com.quick.mvp.bean.HotPlayMovie;

/**
 * Created by beike on 2018/1/15.
 */

public interface IHotPlayMovieView {
    void showData(HotPlayMovie data);
    void onError(Throwable t);
}
