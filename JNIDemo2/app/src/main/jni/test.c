//
// Created by yaoh on 2019/7/30.
//

#include <com_yaoh_jni_MyJni.h>

JNIEXPORT jstring JNICALL Java_com_yaoh_jni_MyJni_get (JNIEnv *env, jobject thiz){

    return (*env)->NewStringUTF(env, "Hello from JNI! Welcome----------->");

}


