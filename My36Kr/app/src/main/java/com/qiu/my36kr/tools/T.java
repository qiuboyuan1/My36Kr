package com.qiu.my36kr.tools;

import android.widget.Toast;

import com.qiu.my36kr.ui.activity.MyApplication;


/**
 * Created by dllo on 16/7/11.
 */
public final class T {
    public T() {
    }
    private static boolean isDebug=true;
    public static void longMsg(String msg){
        if (isDebug){
            Toast.makeText(MyApplication.context, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
