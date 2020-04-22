package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    // use OkHttp create a class to access server
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        // create OKHttpClient object
        OkHttpClient client = new OkHttpClient();
        // parse address
        Request request = new Request.Builder().url(address).build();
        // regist callback
        client.newCall(request).enqueue(callback);
    }
}
