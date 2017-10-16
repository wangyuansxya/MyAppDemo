package com.wangyuan.myappdemo.image.transform;

import android.graphics.Bitmap;

import com.squareup.picasso.Transformation;

/**
 * Created by wangyuan on 2017/9/20.
 */

public class EmptyTransform implements Transformation {


    @Override
    public Bitmap transform(Bitmap source) {

        return null;
    }

    @Override
    public String key() {
        return "EmptyTransform";
    }
}
