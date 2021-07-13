package com.example.wanandroid.contract;

import com.example.wanandroid.model.LoginBean;

public interface LoginContract {

    interface View extends BaseContract.View{
        void showUsername(LoginBean login);
        void logoutSuccess();
    }

    interface Presenter extends BaseContract.Presenter<View>{
        void login(String username,String password);
        void register(String username,String password,String repassword);
        void logout();
    }
}
