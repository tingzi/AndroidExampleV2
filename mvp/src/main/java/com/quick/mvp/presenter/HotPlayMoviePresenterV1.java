package com.quick.mvp.presenter;

import com.quick.mvp.bean.HotPlayMovie;
import com.quick.mvp.model.IHotPlayMovieModel;
import com.quick.mvp.model.HotPlayMovieModelImplV1;
import com.quick.mvp.view.IHotPlayMovieView;

/**
 * Created by beike on 2018/1/15.
 */

public class HotPlayMoviePresenterV1 {

    private IHotPlayMovieView mView;

    private IHotPlayMovieModel mModel = new HotPlayMovieModelImplV1();

    public void fetch() {
        if (null != mModel) {
            mModel.loadData(new IHotPlayMovieModel.ModelListener() {
                @Override
                public void onComplete(HotPlayMovie data) {
                    if (null != mView) {
                        mView.showData(data);
                    }
                }

                @Override
                public void onError(Throwable t) {
                    if (null != mView) {
                        mView.onError(t);
                    }
                }
            });
        }
    }

    public void setView(IHotPlayMovieView view) {
        this.mView = view;
    }

    public void setModel(IHotPlayMovieModel model) {
        this.mModel = model;
    }
}
