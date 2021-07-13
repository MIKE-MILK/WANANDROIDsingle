package com.example.wanandroid.contract;

import com.example.wanandroid.model.SystemChildrenBean;

import java.util.List;

public interface SystemChildContract {
    interface VieW extends BaseContract.View{
        void SystemChild(List<SystemChildrenBean>list);
    }
    interface Presenter extends BaseContract.Presenter<VieW>{
        void getSystemChild();
    }
}
