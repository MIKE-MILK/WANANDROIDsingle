package com.example.wanandroid.model;

public class UserinfoBean {
    /**
     * "data": {
     *         "coinCount": 451, //总积分
     *         "rank": 7, //当前排名
     *         "userId": 2,
     *         "username": "x**oyang"
     *     },
     *     "errorCode": 0,
     *     "errorMsg": ""
     */
    private int coinCount;
    private int rank;
    private int userId;
    private String username;

    public int getCoinCount() {
        return coinCount;
    }

    public int getRank() {
        return rank;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setCoinCount(int coinCount) {
        this.coinCount = coinCount;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
