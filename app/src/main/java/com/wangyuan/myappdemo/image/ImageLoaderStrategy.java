package com.wangyuan.myappdemo.image;

import android.content.Context;

/**
 * Created by wangyuan on 2017/9/20.
 * 图片加载库的策略可以扩展，实现该类然后实现loadImage的图片加载方法即可
 */

public interface ImageLoaderStrategy {

    void loadImage(Context c, ImageLoaderConfig config);


}
