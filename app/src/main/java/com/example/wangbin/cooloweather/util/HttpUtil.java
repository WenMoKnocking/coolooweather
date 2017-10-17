package com.example.wangbin.cooloweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wangbin on 2017/8/27.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client =new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
