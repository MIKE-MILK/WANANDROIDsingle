package com.example.wanandroid.contract;

import com.example.wanandroid.model.ArticleInfo;

import java.util.List;

public interface SystemChildList {
    interface View extends BaseContract.View{
        void showProjectList(List<ArticleInfo> projectList, boolean isEnd);
    }
    interface Presenter extends BaseContract.Presenter<View>{
        void getProjectList(int page,int cid,boolean isSystem);
    }
}
