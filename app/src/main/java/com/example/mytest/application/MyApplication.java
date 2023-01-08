package com.example.mytest.application;

import com.cj.library.BaseApplication;
import com.sgcc.pda.baselibrary.application.HZBaseApplication;
import com.sgcc.pda.baselibrary.utils.LogUtil;


/**
 * Created by cj on 2021/7/19.
 */
public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.init(true);

    }

}
