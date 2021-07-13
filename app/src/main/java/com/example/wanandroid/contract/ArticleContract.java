package com.example.wanandroid.contract;

import com.example.wanandroid.model.ArticleInfo;
import com.example.wanandroid.model.BannerBean;

import java.util.List;

public interface ArticleContract {

    interface View extends BaseContract.View{
        void showArticleList(List<ArticleInfo> articleInfoList,boolean isEnd);
        void showTopArticleList(List<ArticleInfo> topArticleList);
        void showNoSearchResultView();
        void showBanner(List<BannerBean> banners);
    }

    interface Presenter extends BaseContract.Presenter<View>{
        void getArticleList(int page);
        void getTopArticleList();
        void getSearchList(int page,String keyword);
        void getBanner();
    }
}
