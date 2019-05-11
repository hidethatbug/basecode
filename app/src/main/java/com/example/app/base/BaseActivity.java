package com.example.app.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(BindLayout());
        BindId();
        BindData();
        BindListenr();
    }

    /**
     * 绑定布局
     * @return
     */
    public abstract int BindLayout();

    /**
     * 绑定控件
     */
    public abstract void BindId();

    /**
     *数据
     */
    public abstract void BindData();

    /**
     * 绑定监听
     */
    public abstract void BindListenr();


}
