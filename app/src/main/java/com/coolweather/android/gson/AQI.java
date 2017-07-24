package com.coolweather.android.gson;

import java.security.PublicKey;

/**
 * Created by zhanghongguang on 17/7/24.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
