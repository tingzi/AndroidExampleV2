package com.quick.mvp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.quick.mvp.R;
import com.quick.mvp.bean.HotPlayMovie;
import com.quick.mvp.bean.Movie;

/**
 * Created by beike on 2018/1/15.
 */

public class HotPlayMovieAdapter extends RecyclerView.Adapter {

    private HotPlayMovie hotPlayMovie;

    public HotPlayMovieAdapter(HotPlayMovie hotPlayMovie) {
        this.hotPlayMovie = hotPlayMovie;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HotPlayMovieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Movie movie = hotPlayMovie.getMovies().get(position);
        HotPlayMovieViewHolder hotPlayMovieViewHolder = ((HotPlayMovieViewHolder) holder);
        Glide.with(holder.itemView.getContext()).load(movie.getImg()).into(hotPlayMovieViewHolder.img);
        hotPlayMovieViewHolder.name.setText(movie.getTitleCn());
        hotPlayMovieViewHolder.directorName.setText(movie.getDirectorName());
        hotPlayMovieViewHolder.actionName1.setText(movie.getActorName1());
        hotPlayMovieViewHolder.actionName2.setText(movie.getActorName2());
    }

    @Override
    public int getItemCount() {
        if (null != hotPlayMovie) {
            return hotPlayMovie.getCount();
        } else {
            return 0;
        }
    }

    static class HotPlayMovieViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;
        TextView directorName;
        TextView actionName1;
        TextView actionName2;

        public HotPlayMovieViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            directorName = itemView.findViewById(R.id.directorName);
            actionName1 = itemView.findViewById(R.id.actionName1);
            actionName2 = itemView.findViewById(R.id.actionName2);
        }
    }
}
