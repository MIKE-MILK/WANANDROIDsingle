package com.example.wanandroid.model;

import java.util.List;

public class ArticleBean {
    /**
     * "curPage":2,
     * "datas":
     * [{"apkLink":"",
     * "audit":1,
     * "author":"郭霖",
     * "canEdit":false,
     * "chapterId":409,
     * "chapterName":"郭霖",
     * "collect":false,
     * "courseId":13,
     * "desc":"",
     * "descMd":"",
     * "envelopePic":"",
     * "fresh":false,
     * "host":"",
     * "id":18898,
     * "link":"https://mp.weixin.qq.com/s/4G53CZEKzlXdFuuesN57fQ",
     * "niceDate":"2021-07-07 00:00",
     * "niceShareDate":"2天前",
     * "origin":"","prefix":"",
     * "projectLink":"",
     * "publishTime":1625587200000,
     * "realSuperChapterId":407,
     * "selfVisible":0,"shareDate":162566725800
     * 0,"shareUser":"",
     * "superChapterId":408,
     * "superChapterName":"公众号",
     * "tags":
     * [{"name":"公众号",
     * "url":"/wxarticle/list/409/1"}],
     * "title":"如何判断Android应用运行在鸿蒙系统上",
     * "type":0,"userId":-1,"visible":1,"zan":0}
     */

    private int curPage;
    private List<ArticleInfo>articleInfos;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public List<ArticleInfo> getArticleInfos() {
        return articleInfos;
    }

    public void setArticleInfos(List<ArticleInfo> articleInfos) {
        this.articleInfos = articleInfos;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
