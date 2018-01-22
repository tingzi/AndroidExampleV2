package com.quick.glide;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File file = new File(Environment.getExternalStorageDirectory() + "/meet.jpg");
        if(file.exists()) {
            Log.d("test", "=====================file exists");
        } else {
            Log.d("test", "=====================file not exists");
        }
        setDataSource(Environment.getExternalStorageDirectory() + "/meet.jpg");

    }

    public void setDataSource(String path) throws IllegalArgumentException {
        if (path == null) {
            throw new IllegalArgumentException();
        }

        try (FileInputStream is = new FileInputStream(path)) {
            FileDescriptor fd = is.getFD();
        //    setDataSource(fd, 0, 0x7ffffffffffffffL);
        } catch (FileNotFoundException fileEx) {
            throw new IllegalArgumentException();
        } catch (IOException ioEx) {
            throw new IllegalArgumentException();
        }
    }
}
