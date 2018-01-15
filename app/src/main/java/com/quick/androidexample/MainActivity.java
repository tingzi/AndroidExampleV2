package com.quick.androidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * RecyclerView
 * DataBinding
 * Retrofit
 * Okhttp
 * LiveData
 * Lifecycle
 * Room
 * Glide
 *
 */
public class MainActivity extends AppCompatActivity {

    private List<User> mList;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        initData();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setAdapter(new RecyclerAdapter(mList));
    }

    private void initData() {
        mList = new ArrayList<User>();
        for(int i = 0; i<30; i++) {
            String gender;
            if (i % 2 == 0) {
                gender = "男";
            } else {
                gender = "女";
            }
            User user = new User("http://e.hiphotos.baidu.com/image/h%3D300/sign=8d3a9ea62c7f9e2f6f351b082f31e962/500fd9f9d72a6059099ccd5a2334349b023bbae5.jpg",
                    ("姓名" + i), gender);
            mList.add(user);
        }
    }
}
