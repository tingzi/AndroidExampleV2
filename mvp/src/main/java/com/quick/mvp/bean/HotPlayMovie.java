package com.quick.mvp.bean;

import java.util.List;

/**
 * Created by beike on 2018/1/12.
 */

public class HotPlayMovie {
    private int count;
    private List<Movie> movies;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
