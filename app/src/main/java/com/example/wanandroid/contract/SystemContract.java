package com.example.wanandroid.contract;

import com.example.wanandroid.model.SystemBean;

import java.util.List;

public interface SystemContract {

    interface View extends BaseContract.View{
        void showSystemList(List<SystemBean>systemBeanList);
    }
    interface Presenter extends BaseContract.Presenter<View>{
        void getShowSystemList();
    }
}
