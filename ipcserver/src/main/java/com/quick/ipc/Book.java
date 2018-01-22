package com.quick.ipc;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by beike on 2018/1/22.
 * 用Alt+Enter自动生成Parcelable相关代码
 */

public class Book implements Parcelable{

    private String name;
    private int price;

    // 一定要有这个构造函数，否则会使用下面自动生成的序列化构造函数
    public Book() {}

    protected Book(Parcel in) {
        name = in.readString();
        price = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(price);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
