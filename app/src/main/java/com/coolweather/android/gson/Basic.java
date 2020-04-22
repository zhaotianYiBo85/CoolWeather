package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    /*@SerializedName  注解  建立java与JSON的映射*/
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    /*update status*/
    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }





}
