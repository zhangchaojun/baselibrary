package com.example.mytest;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.cj.library.base.BaseActivity;
import com.example.mytest2.R;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "cj";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_start:

                break;
        }
    }


}
