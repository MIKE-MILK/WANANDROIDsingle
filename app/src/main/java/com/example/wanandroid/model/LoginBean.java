package com.example.wanandroid.model;

import java.io.Serializable;
import java.util.List;

public class LoginBean implements Serializable {
    /**
     * collectIds : []
     * email :
     * icon :
     * id : 8645
     * password : 123456
     * token :
     * type : 0
     * username : Crossover
     */
    private String email;
    private String icon;
    private int id;
    private String password;
    private String token;
    private int type;
    private String username;
    private List<Integer>collectIds;

    public String getEmail() {
        return email;
    }

    public String getIcon() {
        return icon;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public int getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public List<Integer> getCollectIds() {
        return collectIds;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCollectIds(List<Integer> collectIds) {
        this.collectIds = collectIds;
    }
}
