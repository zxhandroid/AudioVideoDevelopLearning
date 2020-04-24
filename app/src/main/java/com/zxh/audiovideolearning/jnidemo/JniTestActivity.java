package com.zxh.audiovideolearning.jnidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zxh.audiovideolearning.R;
/**
 * jni使用测试页面
 */
public class JniTestActivity extends AppCompatActivity {

    /**
     * 加载编译好动态so库
     */
    static {
        System.loadLibrary("audioencoder");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jni_test);
    }

    /**
     * jni调用native方法
     * @param view
     */
    public void jniEncode(View view){
        String encode = new JniTestEncoder().encode();
        Toast.makeText(this,encode,Toast.LENGTH_LONG).show();
    }
}
