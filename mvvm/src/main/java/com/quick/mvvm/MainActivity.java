package com.quick.mvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.orhanobut.logger.Logger;
import com.quick.mvvm.adapter.HotPlayMovieAdapter;
import com.quick.mvvm.bean.HotPlayMovie;
import com.quick.mvvm.model.HotPlayMovieModelImplV1;
import com.quick.mvvm.model.IHotPlayMovieModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private HotPlayMovieAdapter mAdapter;
    private IHotPlayMovieModel hotPlayMovieModel = new HotPlayMovieModelImplV1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mAdapter = new HotPlayMovieAdapter();
        mRecyclerView.setAdapter(mAdapter);

        initData();
    }

    private void initData() {
        hotPlayMovieModel.loadData(new IHotPlayMovieModel.ModelListener() {
            @Override
            public void onComplete(HotPlayMovie data) {
                mAdapter.setHotPlayMovie(data);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable t) {
                Logger.d(t);
            }
        });
    }
}
