package com.example.app.mvp;

/**
 * 契约    用户契约 M V P 统一管理 我们的MVP接口
 */
public interface IUserContract {
    /**
     * 用户  V 视图  接口
     */
    public  interface IUserView{
        /**
         * 注册成功
         * @param result
         */
        void registSuccess(String result);

        /**
         * 注册失败
         */
        void registFail();

        /**
         * 登陆成功
         * @param result
         */
        void loginSuccess(String result);

        /**
         * 登陆失败
         */
        void loginFail();


    }

    /**
     * 用户  M 接口
     */
    public  interface  IUserModel{
        /**
         * 进行网络交互
         */
        void doHttpPost();

    }

    /**
     * 用户  P 层接口
     */
    public  interface  IUserPresenter{
        /**
         * 绑定view
         */

        void attach(IUserView view );

        /**
         * 解绑view
         */
        void detach();

        /**
         * 注册
         */
        void regist();

        /**
         * 登录
         */
        void login();

    }

}
