package com.yaoh.jni_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.yaoh.jni.MyJni;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("info", "调用jni层的结果 : " + MyJni.get());

        Toast.makeText(this, MyJni.get(), Toast.LENGTH_SHORT).show();
    }
}
