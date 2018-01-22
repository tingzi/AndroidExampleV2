package com.quick.ipcserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.quick.ipc.Book;
import com.quick.ipc.BookManager;

import java.util.ArrayList;
import java.util.List;

public class IPCService extends Service {

    private List<Book> mBooks = new ArrayList<>();

    private BookManager.Stub mBookManager = new BookManager.Stub() {
        @Override
        public List<Book> getBooks() throws RemoteException {
            return mBooks;
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            synchronized (this) {
                if (null != book) {
                    book.setPrice(60);
                    mBooks.add(book);
                }
            }
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBookManager;
    }
}
