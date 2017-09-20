package com.wangyuan.myappdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.wangyuan.myappdemo.image.ImageLoader;
import com.wangyuan.myappdemo.image.ImageLoaderConfig;

public class MainActivity extends AppCompatActivity {

    private ImageView mIvPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvPic = (ImageView) findViewById(R.id.iv_pic);
        ImageLoader.getInstance().loadImage(new ImageLoaderConfig.Builder()
                .url("http://img.tupianzj.com/uploads/allimg/20151020/ct3eucdl3nw62.jpg")
                .defaultDrawable(R.mipmap.ic_launcher)
                .into(mIvPic)
                .build());
    }
}
