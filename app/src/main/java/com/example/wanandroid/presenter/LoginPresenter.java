package com.example.wanandroid.presenter;

import com.example.wanandroid.Base.BaseBean;
import com.example.wanandroid.Base.BasePresenter;
import com.example.wanandroid.contract.LoginContract;
import com.example.wanandroid.model.LoginBean;
import com.example.wanandroid.util.DataManager;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends BasePresenter<LoginContract.View>implements LoginContract.Presenter {

    private Disposable disposable;
    private DataManager dataManager;

    @Override
    public void login(String username, String password) {
        this.dataManager=dataManager;
    }

    @Override
    public void register(String username, String password, String repassword) {
        Observable<BaseBean<LoginBean>>observable=dataManager.register(username, password, repassword);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseBean<LoginBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        disposable=d;
                    }

                    @Override
                    public void onNext(BaseBean<LoginBean> value) {
                        if (value.getErrorCode()==0){
                            getView().showUsername(value.getData());

                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        getView().showError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void logout() {

    }
}
