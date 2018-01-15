package com.quick.androidexample;

import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by beike on 2018/1/11.
 */

public class User {
    public String icon;
    public String name;
    public String gender;

    public User(String icon, String name, String gender) {
        this.icon = icon;
        this.name = name;
        this.gender = gender;
    }

    public void onclick(TextView view) {
        Toast.makeText(view.getContext(), "点击" + view.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
