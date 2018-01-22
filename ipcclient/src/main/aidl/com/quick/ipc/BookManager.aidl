// IBookManager.aidl
package com.quick.ipc;

// 这里引用的是Book.aidl文件
import com.quick.ipc.Book;

interface BookManager {
    List<Book> getBooks();
    void addBook(in Book book);
}
