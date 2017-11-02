package com.wangyuan.appdemo.app

import android.app.Application
import com.wangyuan.myappdemo.image.ImageLoader
import com.wangyuan.myappdemo.image.PicassoStrategy

/**
 * Created by wangyuan on 2017/9/5.
 */

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val dm = getResources().getDisplayMetrics()
        screenWidth = dm.widthPixels
        screenHeight = dm.heightPixels
        instance = this
         /**
         * 初始化配置，使用Picasso作为图片加载框架
         */
        ImageLoader.getInstance().setImageLoaderStrategy(PicassoStrategy())
    }

    companion object {
        var screenWidth : Int = 0;
        var screenHeight : Int = 0;

        var instance : MyApp? = null
    }
}
