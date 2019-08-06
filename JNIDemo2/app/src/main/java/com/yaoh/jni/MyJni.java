package com.yaoh.jni;

/**
 * Created by yaoh on 2019/7/30
 */
public class MyJni {

    static {
        System.loadLibrary("MyJni");
    }

    public native static String get();

}
