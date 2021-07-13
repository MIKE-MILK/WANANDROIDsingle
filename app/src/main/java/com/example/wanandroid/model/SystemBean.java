package com.example.wanandroid.model;

import java.util.List;

public class SystemBean {
    /**
     *"children":
     * [{"children":[],
     * "courseId":13,
     * "id":60,
     * "name":"Android Studio相关",
     * "order":1000,
     * "parentChapterId":150,
     * "userControlSetTop":false,
     * "visible":1}ControlSetTop":false,"visible":1}
     */
    private int id;
    private String name;
    private int courseId;
    private int order;
    private int visible;
    private int parentChapterId;
    private List<SystemChildrenBean>children;

    public List<SystemChildrenBean> getChildren() {
        return children;
    }

    public void setChildren(List<SystemChildrenBean> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getOrder() {
        return order;
    }

    public int getVisible() {
        return visible;
    }

    public int getParentChapterId() {
        return parentChapterId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public void setParentChapterId(int parentChapterId) {
        this.parentChapterId = parentChapterId;
    }
}
