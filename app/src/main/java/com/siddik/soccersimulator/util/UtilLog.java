package com.siddik.soccersimulator.util;

import android.util.Log;

/**
 * Created by Sidleh on 6/19/2017.
 */

public class UtilLog {
    private static boolean isLog = false;

    public static void setIsLog(boolean b) {
        isLog = b;
    }

    public static void d(String tag, String msg) {
        if(isLog){
            Log.d(tag, msg);
        }
    }
}
