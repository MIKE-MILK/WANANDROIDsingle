package com.example.wanandroid.util;

import android.util.Log;

import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {

    public static final String BASE_API="https://www.wanandroid.com";
    public static final int CONNECT_TIME_OUT=30;
    public static final int READ_TIME_OUT=30;
    public static final int WRITE_TIME_OUT=30;
    private static RetrofitUtils mInstance=null;

    public static RetrofitUtils get(){
        if (mInstance==null){
            synchronized (RetrofitUtils.class){
                if (mInstance==null){
                    mInstance=new RetrofitUtils();
                }
            }
        }
        return mInstance;
    }

    private static OkHttpClient okHttpClient(){
        ClearableCookieJar cookieJar=new PersistentCookieJar(new SetCookieCache(),new SharedPrefsCookiePersistor(App.getContext()));
        HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.e(message,"okhttp");
            }
        });
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client=new OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(WRITE_TIME_OUT,TimeUnit.SECONDS)
                .readTimeout(WRITE_TIME_OUT,TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .cookieJar(cookieJar)
                .build();
        return client;
    }

    public Retrofit retrofit(){
        Retrofit retrofit=new Retrofit.Builder()
                .client(okHttpClient())
                .baseUrl(BASE_API)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit;
    }
}
