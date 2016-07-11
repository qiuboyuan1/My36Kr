package com.qiu.my36kr.ui.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by dllo on 16/7/11.
 */
public class MyApplication extends Application{
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
