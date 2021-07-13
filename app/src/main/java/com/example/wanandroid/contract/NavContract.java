package com.example.wanandroid.contract;

import com.example.wanandroid.model.NavInfoBean;

public interface  NavContract {

    interface View extends BaseContract.View{
        void showNavInfo(NavInfoBean navInfoBean);
    }
    interface Presenter extends BaseContract.Presenter<View>{
        void getNavInfo();
    }
}
