package com.example.wanandroid.model;

public class ArticleInfo {
    /**
     *apkLink":"",
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
     * "origin":"",
     * "prefix":"",
     * "projectLink":"",
     * "publishTime":1625587200000,
     * "realSuperChapterId":407,
     * "selfVisible":0,"shareDate":1625667258000,"shareUser":"",
     * "superChapterId":408,
     * "superChapterName":"公众号",
     */
    private String apkLink;
    private String author;
    private int audit;
    private String chapterName;
    private Boolean collect;
    private int courseId;
    private String link;
    private int id;
    private String niceDate;
    private String niceShareDate;
    private String superChapterId;
    private String superChapterName;

    public String getApkLink() {
        return apkLink;
    }

    public void setApkLink(String apkLink) {
        this.apkLink = apkLink;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAudit() {
        return audit;
    }

    public void setAudit(int audit) {
        this.audit = audit;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Boolean getCollect() {
        return collect;
    }

    public void setCollect(Boolean collect) {
        this.collect = collect;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNiceDate() {
        return niceDate;
    }

    public void setNiceDate(String niceDate) {
        this.niceDate = niceDate;
    }

    public String getNiceShareDate() {
        return niceShareDate;
    }

    public void setNiceShareDate(String niceShareDate) {
        this.niceShareDate = niceShareDate;
    }

    public String getSuperChapterId() {
        return superChapterId;
    }

    public void setSuperChapterId(String superChapterId) {
        this.superChapterId = superChapterId;
    }

    public String getSuperChapterName() {
        return superChapterName;
    }

    public void setSuperChapterName(String superChapterName) {
        this.superChapterName = superChapterName;
    }
}
