package com.example.mytest.application;

import android.os.SystemClock;

import com.cj.library.base.BaseApplication;


/**
 * Created by cj on 2021/7/19.
 */
public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        SystemClock.sleep(2000);

    }

}
