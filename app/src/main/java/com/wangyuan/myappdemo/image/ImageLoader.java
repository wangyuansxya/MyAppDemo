package com.wangyuan.myappdemo.image;

import com.wangyuan.myappdemo.app.MyApp;

/**
 * Created by wangyuan on 2017/9/2.
 * 策略者，调度者
 */
public class ImageLoader {
    /*Picasso.with(context).load(url)
    .placeholder(R.drawable.user_placeholder)
    .error(R.drawable.user_placeholder_error)
    .into(imageView);*/

    /*Picasso.with(context).load(R.drawable.landing_screen).into(imageView1);
    Picasso.with(context).load("file:///android_asset/DvpvklR.png").into(imageView2);
    Picasso.with(context).load(new File(...)).into(imageView3);*/

    private volatile static ImageLoader mImageLoader;

    private ImageLoader() {
    }

    public static ImageLoader getInstance() {
        if(mImageLoader == null) {
            synchronized (ImageLoader.class) {
                if(mImageLoader == null) {
                    mImageLoader = new ImageLoader();
                }
            }
        }
        return mImageLoader;
    }

    private ImageLoaderStrategy mImageLoaderStrategy;
    /**
     * 设置使用的图片加载框架
     * @param imageLoaderStrategy
     */
    public void setImageLoaderStrategy(ImageLoaderStrategy imageLoaderStrategy){
        this.mImageLoaderStrategy = imageLoaderStrategy;
    }
    /**
     * 加载图片
     * @param imageLoader
     */
    public void loadImage(ImageLoaderConfig imageLoader){
        if(mImageLoaderStrategy == null) throw new NullPointerException("mImageLoaderStrategy can not been null");
        mImageLoaderStrategy.loadImage(MyApp.inst(), imageLoader);
    }

}
