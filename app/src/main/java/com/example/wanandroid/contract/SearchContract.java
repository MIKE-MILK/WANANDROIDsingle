package com.example.wanandroid.contract;

import com.example.wanandroid.model.HotKeyBean;

import java.util.List;

public interface SearchContract {

    interface View extends BaseContract.View{
        void showHotKey(List<HotKeyBean>hotKeyBeanList);
    }
    interface Presenter extends BaseContract.Presenter<View>{
        void getShowHotKey();
    }
}
