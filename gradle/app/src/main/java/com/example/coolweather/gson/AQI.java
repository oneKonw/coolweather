package com.example.coolweather.gson;

import android.widget.ArrayAdapter;

/**
 * Created by hyt on 2017/11/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
