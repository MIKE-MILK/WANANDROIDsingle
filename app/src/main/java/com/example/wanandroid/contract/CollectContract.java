package com.example.wanandroid.contract;

import com.example.wanandroid.model.ArticleInfo;

import java.util.List;

public interface CollectContract {

    interface View extends BaseContract.View{
        void showArticleList(List<ArticleInfo> articleInfoList, boolean isEnd);
        void showNoCollectView();
        void showCollectSuccess();
        void showCancelCollectSuccess();
    }
    interface Presenter extends BaseContract.Presenter<View>{
        void getCollectList(int page);
        void collectArticle(int id);
        void cancelCollectArticle(int id,int originId);
    }
}
