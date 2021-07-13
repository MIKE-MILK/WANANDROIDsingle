package com.example.wanandroid.util;

import com.example.wanandroid.model.ArticleBean;
import com.example.wanandroid.model.ArticleInfo;
import com.example.wanandroid.Base.BaseBean;
import com.example.wanandroid.model.BannerBean;
import com.example.wanandroid.model.HotKeyBean;
import com.example.wanandroid.model.LoginBean;
import com.example.wanandroid.model.MyIntegralBean;
import com.example.wanandroid.model.NavInfoBean;
import com.example.wanandroid.model.NavTitle;
import com.example.wanandroid.model.SystemBean;
import com.example.wanandroid.model.SystemChildrenBean;

import java.util.List;
import java.util.Map;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ServiceApi {

    @POST("query")
    Observable<BaseBean<List<LoginBean>>> login(@QueryMap Map<String,String> map);
    @POST("query")
    Observable<BaseBean<List<LoginBean>>>logout(@QueryMap Map<String,String>map);
    //获取文章
    @GET("/article/list/{page}/json")
    Observable<BaseBean<ArticleBean>>getArticleList(@Path("page")int page);
    //获取定置文章
    @GET("/article/top/json")
    Observable<BaseBean<List<ArticleInfo>>>getArticleInfoList();
    //体系
    @GET("/tree/json")
    Observable<BaseBean<List<SystemBean>>>getSystem();
    //体系文章
    @GET("/article/list/{page}/json")
    Observable<BaseBean<ArticleBean>>getSystemArticle(@Path("page") int page,@Query("cid") int cid);
    //导航数据
    @GET("/navi/json")
    Observable<BaseBean<List<NavTitle>>>getNavInfo();
    //项目分类
    @GET("/project/tree/json")
    Observable<BaseBean<List<SystemChildrenBean>>>getProject();
    //项目数据
    @GET("/project/list/{page}/json")
    Observable<BaseBean<ArticleInfo>>getProjectArticle(@Path("page")int page,@Query("cid")int cid);
    //登录
    @POST("/user/login")
    Observable<BaseBean<LoginBean>>login(@Query("username")String username,@Query("password")String password);
    //注册 username,password,repassword
    @POST("/user/register")
    Observable<BaseBean<LoginBean>>register(@Query("username")String username,@Query("password")String password,@Query("repassword")String repassword);
    //注销
    @GET("/user/logout/json")
    Observable<BaseBean>logout();
    //收藏文章列表
    @GET("/lg/collect/list/{page}/json")
    Observable<BaseBean<ArticleBean>>getCollectArticleList(@Path("page")int page);
    //收藏站内文章
    @POST("/lg/collect/{id}/json")
    Observable<BaseBean>getCollectArticle(@Path("id") int id);
    //收藏站内文章
    @POST("/lg/collect/add/json")
    Observable<BaseBean>getCollectOutArticle();
    //取消收藏
    @POST("/lg/uncollect/{id}/json")
    Observable<BaseBean> cancelCollectArticle(@Path("id") int id,@Query("originId") int originId);
    //搜索热词
    @POST("/hotkey/json")
    Observable<BaseBean<List<HotKeyBean>>> getHotKey();
    //个人积分
    @GET("/lg/coin/userinfo/json")
    Observable<BaseBean<MyIntegralBean>> getMyIntegral();
    @GET("/banner/json")
    Observable<BaseBean<List<BannerBean>>> getBanner();
    @POST("/article/query/{page}/json")
    Observable<BaseBean<ArticleBean>> getSearchList(@Path("page") int page,@Query("k") String keyword);
}
