package com.qiu.my36kr.tools;

import android.util.Log;

/**
 * Created by dllo on 16/7/11.
 */
public final class L {
    public L() {
    }
    private static boolean isDebug=true;
    private static String TAG="My36Kr";
    public static void e(String msg){
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }
    public static void i(String msg){
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }
    public static void v(String msg){
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }
}
