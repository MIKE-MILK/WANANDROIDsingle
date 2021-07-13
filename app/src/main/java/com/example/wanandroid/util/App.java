package com.example.wanandroid.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.BuildConfig;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.tencent.bugly.Bugly;

public class App extends Application {
    private static App mContext;
    private RefWatcher refWatcher;
    private boolean isBackground = true;

    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(),"e5f4334f82",true);
        mContext=this;
        registerActivityLifecycleCallbacks(lifecycleCallbacks);
        if (LeakCanary.isInAnalyzerProcess(this)){
            return;
        }
        refWatcher=LeakCanary.install(this);
        Logger.addLogAdapter(new AndroidLogAdapter(){
            @Override
            public boolean isLoggable(int priority, @Nullable String tag) {
                return BuildConfig.DEBUG;
            }
        });
    }

    public static synchronized App getContext(){
        return mContext;
    }

    public static RefWatcher getRefWatcher(Context context){
        App app=(App)context.getApplicationContext();
        return app.refWatcher;
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (level>=TRIM_MEMORY_UI_HIDDEN){
            isBackground=true;
            Log.d("进入后台","进入后台");
            Glide.get(this).clearMemory();
        }
        Glide.get(this).trimMemory(level);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Glide.get(this).clearMemory();
    }
    private ActivityLifecycleCallbacks lifecycleCallbacks=new ActivityLifecycleCallbacks() {
        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {

        }

        @Override
        public void onActivityStarted(@NonNull Activity activity) {

        }

        @Override
        public void onActivityResumed(@NonNull Activity activity) {
            if (isBackground){
                isBackground=false;
            }
        }

        @Override
        public void onActivityPaused(@NonNull Activity activity) {

        }

        @Override
        public void onActivityStopped(@NonNull Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

        }

        @Override
        public void onActivityDestroyed(@NonNull Activity activity) {

        }
    };
}
