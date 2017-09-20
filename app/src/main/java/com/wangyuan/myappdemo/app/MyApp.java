package com.wangyuan.myappdemo.app;

import android.app.Application;

import com.wangyuan.myappdemo.image.ImageLoader;
import com.wangyuan.myappdemo.image.PicassoStrategy;

/**
 * Created by wangyuan on 2017/9/20.
 */

public class MyApp extends Application {

    private static MyApp mApp = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;

        /**
         * 初始化配置，使用Picasso作为图片加载框架
         */
        ImageLoader.getInstance().setImageLoaderStrategy(new PicassoStrategy());

    }

    public static MyApp inst() {
        return mApp;
    }
}
