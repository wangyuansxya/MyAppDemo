package com.wangyuan.myappdemo.ui;

/**
 * Created by wangyuan on 2017/9/20.
 */

public interface ActivityWrapper {
    /**
     * 初始化view
     */
    void initView();

    /**
     * 初始化数据，例如从上个页面携带过来的data
     */
    void initData();

    /**
     * 发送网络请求
     */
    void queryData();

    /**
     * 填充数据的方法
     */
    void fillData();

}
