package com.wangyuan.myappdemo.image;

import android.content.Context;

import com.squareup.picasso.Picasso;

/**
 * Created by wangyuan on 2017/9/20.
 * Picasso的图片加载策略
 */

public class PicassoStrategy implements ImageLoaderStrategy {
    @Override
    public void loadImage(Context c, ImageLoaderConfig config) {
        Picasso.with(c).load(config.getUrl())
                .error(config.getDefaultDrawable())
                .placeholder(config.getDefaultDrawable())
                .transform(config.getTransformation())
                .into(config.getImageView());
    }
}
