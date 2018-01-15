package com.quick.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.quick.mvp.adapter.HotPlayMovieAdapter;
import com.quick.mvp.bean.HotPlayMovie;
import com.quick.mvp.presenter.HotPlayMoviePresenterV1;
import com.quick.mvp.view.IHotPlayMovieView;

public class MainActivity extends AppCompatActivity implements IHotPlayMovieView {

    private HotPlayMoviePresenterV1 presenterV1;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        presenterV1 = new HotPlayMoviePresenterV1();
        presenterV1.setView(this);
        presenterV1.fetch();
    }

    @Override
    public void showData(HotPlayMovie data) {
        recyclerView.setAdapter(new HotPlayMovieAdapter(data));
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }
}
