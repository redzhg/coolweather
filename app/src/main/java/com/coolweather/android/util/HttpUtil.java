package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhanghongguang on 17/7/23.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address+"&key=79505fd794d344ea949e815cc768e551").build();
        client.newCall(request).enqueue(callback);
    }
}
