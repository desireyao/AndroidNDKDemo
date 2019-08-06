package com.yaoh.jni;

/**
 * Created by yaoh on 2019/7/30
 */
public class JNIUtils {

    static {
        System.loadLibrary("native-lib");
    }

    //java调C中的方法都需要用native声明且方法名必须和c的方法名一样
    public native String stringFromJNI();

}
