package com.coolweather.android.gson;

/**
 * Created by 刘健 on 2018/6/8.
 */

import com.google.gson.annotations.SerializedName;


public class Now {

    @SerializedName("tmp")
    public String temperature;


    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}