package com.zxh.audiovideolearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zxh.audiovideolearning.jnidemo.JniTestActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainAdapter.ItemClickListener {

    private RecyclerView rvContainer;
    private ArrayList<String> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvContainer = findViewById(R.id.rv_container);
        initDatas();
        initAdapter();
    }

    private void initDatas() {
        datas.add("jni调用demo");
    }

    /**
     * 初始化adapter
     */
    private void initAdapter() {
        rvContainer.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        MainAdapter mainAdapter = new MainAdapter(datas);
        rvContainer.setAdapter(mainAdapter);
        mainAdapter.setOnItemClickListener(this);

    }

    @Override
    public void itemClick(int position) {
        switch (position){
            case 0:
                jump2Activity(JniTestActivity.class);
                break;
            default:
                break;
        }
    }

    /**
     * 跳转到相应界面
     * @param aClass
     */
    private void jump2Activity(Class aClass) {
        Intent intent = new Intent(this,aClass);
        startActivity(intent);
    }
}
