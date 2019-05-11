package com.example.app.mvp;

import android.view.View;

/**
 * 用户业务逻辑实现类
 */
public class UserPresenterImpl implements IUserContract.IUserPresenter {


    private IUserContract.IUserView view;

    @Override
    public void attach(IUserContract.IUserView view) {
        this.view = view;


    }

    @Override
    public void detach() {

    }

    @Override
    public void regist() {

    }

    @Override
    public void login() {

    }
}
