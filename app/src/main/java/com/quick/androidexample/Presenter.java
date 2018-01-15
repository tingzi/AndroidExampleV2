package com.quick.androidexample;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by beike on 2018/1/11.
 */

public class Presenter {

    @BindingAdapter({ "imageUrl" })
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}
