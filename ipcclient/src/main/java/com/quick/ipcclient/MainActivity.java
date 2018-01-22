package com.quick.ipcclient;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.orhanobut.logger.Logger;
import com.quick.ipc.Book;
import com.quick.ipc.BookManager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BookManager mBookManager;
    private boolean mBound = false;
    private List<Book> mBooks;
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Logger.d("服务绑定成功");
            mBookManager = BookManager.Stub.asInterface(service);
            mBound = true;
            if (null != mBookManager) {
                try {
                    mBooks = mBookManager.getBooks();
                    Logger.d(mBooks);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Logger.d("服务断开");
            mBound = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addBook(View view) {
        if (!mBound) {
            attempToBindService();
            return;
        }

        if (null == mBookManager) {
            return;
        }

        Book book = new Book();
        book.setName("Android IPC通信");
        book.setPrice(50);
        Logger.d(book);
        try {
            mBookManager.addBook(book);
            mBooks = mBookManager.getBooks();
            Logger.d(mBooks);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void attempToBindService() {
        Intent intent = new Intent("com.quick.book");
        intent.setPackage("com.quick.ipcserver");
        bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!mBound) {
            attempToBindService();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mBound) {
            unbindService(mServiceConnection);
            mBound = false;
        }
    }

}
