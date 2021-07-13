package com.example.wanandroid.util;

import com.example.wanandroid.Base.BaseBean;
import com.example.wanandroid.model.ArticleBean;
import com.example.wanandroid.model.ArticleInfo;
import com.example.wanandroid.model.BannerBean;
import com.example.wanandroid.model.HotKeyBean;
import com.example.wanandroid.model.LoginBean;
import com.example.wanandroid.model.MyIntegralBean;
import com.example.wanandroid.model.NavInfoBean;
import com.example.wanandroid.model.NavTitle;
import com.example.wanandroid.model.SystemBean;
import com.example.wanandroid.model.SystemChildrenBean;
import com.tencent.bugly.proguard.B;

import java.util.List;

import io.reactivex.Observable;

public class DataManager {

    private ServiceApi serviceApi;

    public DataManager(ServiceApi api){
        this.serviceApi=api;
    }

    public Observable<BaseBean<ArticleBean>>getArticle(int page){
        return serviceApi.getArticleList(page);
    }

    public Observable<BaseBean<List<ArticleInfo>>>getArticleInfo(){
        return serviceApi.getArticleInfoList();
    }

    public Observable<BaseBean<List<SystemChildrenBean>>>getProject(){
        return serviceApi.getProject();
    }

    public Observable<BaseBean<List<ArticleInfo>>>getProject(int page,int cid){
        return  null;
    }

    public Observable<BaseBean<List<SystemBean>>>getSystemInfo(){
        return serviceApi.getSystem();
    }

    public Observable<BaseBean<ArticleBean>>getSystemArticle(int page,int cid){
        return serviceApi.getSystemArticle(page,cid);
    }

    public Observable<BaseBean<List<NavTitle>>>getNavInfo(){
        return serviceApi.getNavInfo();
    }

    public Observable<BaseBean<ArticleBean>>getSearchList(int page,String keyword){
        return serviceApi.getSearchList(page,keyword);
    }

    public Observable<BaseBean<List<BannerBean>>>getBanner(){
        return serviceApi.getBanner();
    }

    public Observable<BaseBean<LoginBean>>login(String name,String password){
        return serviceApi.login(name, password);
    }
    public Observable<BaseBean<ArticleBean>>getCollect(int page){
        return serviceApi.getCollectArticleList(page);
    }

    public Observable<BaseBean<LoginBean>>register(String name,String password,String repassword){
        return serviceApi.register(name, password, repassword);
    }

    public Observable<BaseBean>logout(){
        return serviceApi.logout();
    }

    public Observable<BaseBean>collect(int id){
        return serviceApi.getCollectArticle(id);
    }

    public Observable<BaseBean> cancelCollectArticle(int id,int originId){
        return serviceApi.cancelCollectArticle(id,originId);
    }
    public Observable<BaseBean<List<HotKeyBean>>> getHotKey(){
        return serviceApi.getHotKey();
    }

    public Observable<BaseBean<MyIntegralBean>> getMyIntegral(){
        return serviceApi.getMyIntegral();
    }
}
