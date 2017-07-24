package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhanghongguang on 17/7/24.
 */

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("tex_d")
        public String info;
    }
}
