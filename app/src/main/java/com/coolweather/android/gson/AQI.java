package com.coolweather.android.gson;

public class AQI {
    public AQICity city;  //city

    public class AQICity{
        public String aqi;    //weather air quality index
        public String pm25;
    }
}
