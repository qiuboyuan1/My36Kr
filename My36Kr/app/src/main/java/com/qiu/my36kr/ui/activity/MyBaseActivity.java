package com.qiu.my36kr.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.qiu.my36kr.R;
import com.qiu.my36kr.tools.T;

/**
 * Created by dllo on 16/7/11.
 */
public abstract class MyBaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定布局
        setContentView(setLayout());
        //初始化组件
        initView();
        //添加数据
        initData();
    }
    /**
     * 设置布局
     */
    protected abstract int setLayout();
    /**
     * 初始化组件
     */
    protected abstract void initView();
    //在initView里调用此此方法
    protected <T extends View>T byView(int id){
        T t=(T)findViewById(id);
        return t;
    }
    protected abstract void initData();

    protected void toDo(Context from,Class<?extends MyBaseActivity>to){
        Intent intent=new Intent(from,to);
        startActivity(intent);
    }
}
