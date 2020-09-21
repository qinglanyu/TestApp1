package com.example.testapp1;

import android.app.Application;

import java.util.HashMap;

// 以下单例可用在各个Activity之间交换数据
public class MainApplication extends Application {
    private static MainApplication mApp;

    public HashMap<String, String> mInfoMap = new HashMap<String, String>();

    public static MainApplication getInstance(){
        return mApp;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mApp = this;
    }
}

