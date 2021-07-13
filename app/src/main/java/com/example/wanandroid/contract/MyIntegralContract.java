package com.example.wanandroid.contract;

import com.example.wanandroid.model.MyIntegralBean;

public interface MyIntegralContract {

    interface View extends BaseContract.View{
        void showMyIntegral(MyIntegralBean myIntegralBean);
    }
    interface Presenter extends BaseContract.Presenter<View>{
        void getMyIntegral();
    }
}
