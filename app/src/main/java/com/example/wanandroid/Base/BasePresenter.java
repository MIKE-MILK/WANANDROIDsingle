package com.example.wanandroid.Base;

import com.example.wanandroid.contract.BaseContract;

public class BasePresenter <V extends BaseContract.View> implements BaseContract.Presenter<V>  {

    private V view;

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view=null;
    }

    public boolean isViewAttached(){
        return view!=null;
    }

    public V getView(){
        return view;
    }
}
