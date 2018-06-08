package com.coolweather.android.gson;

/**
 * Created by 刘健 on 2018/6/8.
 */

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class Temperature {

        public String max;
        public String min;

    }


    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}