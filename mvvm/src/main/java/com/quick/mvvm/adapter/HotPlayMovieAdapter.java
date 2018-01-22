package com.quick.mvvm.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quick.mvvm.R;
import com.quick.mvvm.bean.HotPlayMovie;
import com.quick.mvvm.databinding.ItemLayoutBinding;

/**
 * Created by beike on 2018/1/11.
 */

public class HotPlayMovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private HotPlayMovie hotPlayMovie;

    public void setHotPlayMovie(HotPlayMovie hotPlayMovie) {
        this.hotPlayMovie = hotPlayMovie;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HotPlayMoveViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HotPlayMoveViewHolder hotPlayMoveViewHolder = (HotPlayMoveViewHolder) holder;
        hotPlayMoveViewHolder.binding.setMovie(hotPlayMovie.getMovies().get(position));
    }

    @Override
    public int getItemCount() {
        if (null == hotPlayMovie) {
            return 0;
        } else {
            return hotPlayMovie.getCount();
        }
    }

    class HotPlayMoveViewHolder extends RecyclerView.ViewHolder {

        ItemLayoutBinding binding;

        public HotPlayMoveViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

}
