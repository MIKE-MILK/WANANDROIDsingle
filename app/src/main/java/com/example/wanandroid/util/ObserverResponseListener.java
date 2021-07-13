package com.example.wanandroid.util;

public interface ObserverResponseListener<T> {
    void onNext(T o);
    void onError(Throwable e);
}
