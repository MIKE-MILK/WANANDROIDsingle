package com.example.wanandroid.model;

import java.util.List;

public class NavTitle {
    /**
     * "articles":
     * [{"apkLink":"",
     * "audit":1,
     * "author":"小编",
     * "canEdit":false,
     * "chapterId":272,
     * "chapterName":"常用网站",
     * "collect":false,
     * "courseId":13,
     * "desc":"",
     * "descMd":"",
     * "envelopePic":"",
     * "fresh":false,
     * "host":"",
     * "id":1848,
     * "link":"https://developers.google.cn/",
     * "niceDate":"2018-01-07 18:59",
     * "niceShareDate":"未知时间",
     * "origin":"",
     * "prefix":"",
     * "projectLink":"",
     * "publishTime":1515322795000,
     * "realSuperChapterId":0,"
     * selfVisible":0,"shareDate":null,
     * "shareUser":"",
     * "superChapterId":0,
     * "superChapterName":"",
     * "tags":[],"title":"Google开发者",
     * "type":0,"userId":-1,
     * "visible":0,
     * "zan":0
     */
    private int cid;
    private String name;
    private List<NavInfoBean> articles;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NavInfoBean> getArticles() {
        return articles;
    }

    public void setArticles(List<NavInfoBean> articles) {
        this.articles = articles;
    }
}
