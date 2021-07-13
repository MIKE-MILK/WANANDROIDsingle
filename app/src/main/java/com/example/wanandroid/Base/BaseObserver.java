package com.example.wanandroid.Base;

import com.example.wanandroid.util.ObserverResponseListener;


import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class BaseObserver <T> implements Observer<T> {
    private ObserverResponseListener listener;

    public BaseObserver(ObserverResponseListener listener){
        this.listener = listener;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T o) {
        BaseResponse resp = (BaseResponse) o;
        int code = resp.getErrorCode();
        if(code == 0){
            listener.onNext(resp.getData());
        }
    }

    @Override
    public void onError(Throwable e) {
        listener.onError(e);
    }

    @Override
    public void onComplete() {

    }
}
