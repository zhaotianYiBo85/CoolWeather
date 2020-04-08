package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        //1.create a OkHttpClient object
        OkHttpClient client = new OkHttpClient();
        //2.parse request address
        Request request = new Request.Builder().url(address).build();
        //3.register request callback
        client.newCall(request).enqueue(callback);
    }

}
