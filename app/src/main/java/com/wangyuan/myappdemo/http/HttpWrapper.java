package com.wangyuan.myappdemo.http;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by wangyuan on 2017/9/2.
 */

public class HttpWrapper {

    private OkHttpClient mHttpClient = null;

    private RequestBody mBody = null;

    private Request mRequest;

    private Call mCall;



    private String url;

    private HttpWrapper() {

    }




    public static class Builder {

        private HttpWrapper mHttp;

        public Builder() {
            mHttp = new HttpWrapper();
        }

        public HttpWrapper param() {
            return mHttp;
        }



    }


}
