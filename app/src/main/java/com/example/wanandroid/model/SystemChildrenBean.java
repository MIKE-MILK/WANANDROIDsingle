package com.example.wanandroid.model;

public class SystemChildrenBean {
    /**
     *"children": [],
     *             "courseId": 13,
     *             "id": 60, // id会在查看该目录下所有文章时有用
     *             "name": "Android Studio相关", // 子名称
     *             "order": 1000,
     *             "parentChapterId": 150,
     *             "visible": 1
     */
    private int id;
    private String name;
    private int order;
    private int parentChapterId;
    private int visible;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public int getParentChapterId() {
        return parentChapterId;
    }

    public int getVisible() {
        return visible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setParentChapterId(int parentChapterId) {
        this.parentChapterId = parentChapterId;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }
}
