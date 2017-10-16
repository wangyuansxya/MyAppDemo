package com.wangyuan.myappdemo.image;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Transformation;

/**
 * Created by wangyuan on 2017/9/20.
 */

public class ImageLoaderConfig {

    //图片类型
    public static final int PIC_LARGE = 0;//大图
    public static final int PIC_MEDIUM = 1;//中图
    public static final int PIC_SMALL = 2;//小图
    //是否在 WIFI 下加载
    public static final int LOAD_STRATEGY_NORMAL = 0;
    public static final int LOAD_STRATEGY_ONLY_WIFI = 1;

    private Context context;
    /**
     * //加载策略，是否在 wifi 下才加载
     */
    private int wifiStrategy;
    /**
     * 类型 (大图，中图，小图)
     */
    private int type;

    /**
     * 图片地址
     */
    private String url;
    /**
     * 显示图片的view
     */
    private ImageView imageView;
    /**
     * 下载失败显示的图片
     */
    private int errorDrawable;
    /**
     * 默认的图片
     */
    private int defaultDrawable;
    /**
     * 加载中图片
     */
    private int loadingDrawable;

    /**
     * 图片显示的形状
     */
    private Transformation mTransformation;

    public Context getContext() {
        return context;
    }

    public int getWifiStrategy() {
        return wifiStrategy;
    }

    public int getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getErrorDrawable() {
        return errorDrawable <= 0 ? defaultDrawable : errorDrawable;
    }

    public int getDefaultDrawable() {
        return defaultDrawable;
    }

    public int getLoadingDrawable() {
        return loadingDrawable <= 0 ? defaultDrawable : loadingDrawable;
    }

    public Transformation getTransformation() {
        return mTransformation;
    }

    private ImageLoaderConfig(Builder builder) {
        context = builder.context;
        wifiStrategy = builder.wifiStrategy;
        type = builder.type;
        url = builder.url;
        imageView = builder.imageView;
        errorDrawable = builder.errorDrawable;
        defaultDrawable = builder.defaultDrawable;
        loadingDrawable = builder.loadingDrawable;
        mTransformation = builder.mTransformation;
    }

    public static final class Builder {
        private Context context;
        private int wifiStrategy;
        private int type;
        private String url;
        private ImageView imageView;
        private int errorDrawable;
        private int defaultDrawable;
        private int loadingDrawable;

        private Transformation mTransformation;
        public Builder() {
        }

        public Builder context(Context val) {
            context = val;
            return this;
        }

        public Builder wifiStrategy(int val) {
            wifiStrategy = val;
            return this;
        }

        public Builder type(int val) {
            type = val;
            return this;
        }

        public Builder url(String val) {
            url = val;
            return this;
        }

        public Builder into(ImageView val) {
            imageView = val;
            return this;
        }

        public Builder errorDrawable(int val) {
            errorDrawable = val;
            return this;
        }

        public Builder defaultDrawable(int val) {
            defaultDrawable = val;
            return this;
        }

        public Builder loadingDrawable(int val) {
            loadingDrawable = val;
            return this;
        }

        public Builder transform(Transformation val) {
            mTransformation = val;
            return this;
        }

        public ImageLoaderConfig build() {
            return new ImageLoaderConfig(this);
        }
    }
}
