package com.wangyuan.myappdemo.image;

import android.widget.ImageView;

import com.wangyuan.appdemo.app.MyApp;
import com.wangyuan.myappdemo.R;
import com.wangyuan.myappdemo.image.transform.EmptyTransform;

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
        if (mImageLoader == null) {
            synchronized (ImageLoader.class) {
                if (mImageLoader == null) {
                    mImageLoader = new ImageLoader();
                }
            }
        }
        return mImageLoader;
    }

    private ImageLoaderStrategy mImageLoaderStrategy;

    /**
     * 设置使用的图片加载框架
     *
     * @param imageLoaderStrategy
     */
    public void setImageLoaderStrategy(ImageLoaderStrategy imageLoaderStrategy) {
        this.mImageLoaderStrategy = imageLoaderStrategy;
    }

    /**
     * 加载图片
     *
     * @param imageLoader
     */
    public void loadImage(ImageLoaderConfig imageLoader) {
        if (mImageLoaderStrategy == null)
            throw new NullPointerException("mImageLoaderStrategy can not been null");
        mImageLoaderStrategy.loadImage(MyApp.Companion.getInstance(), imageLoader);
    }

    public void loadImage(String url, ImageView iv) {
        if (mImageLoaderStrategy == null)
            throw new NullPointerException("mImageLoaderStrategy can not been null");
        mImageLoaderStrategy.loadImage(MyApp.Companion.getInstance(), new ImageLoaderConfig.Builder()
                .url(url)
                .defaultDrawable(R.mipmap.ic_launcher)
                .transform(new EmptyTransform())
                .errorDrawable(R.mipmap.ic_launcher)
                .loadingDrawable(R.mipmap.ic_launcher)
                .wifiStrategy(ImageLoaderConfig.LOAD_STRATEGY_NORMAL)
                .type(ImageLoaderConfig.PIC_LARGE)
                .into(iv).build());
    }
}
