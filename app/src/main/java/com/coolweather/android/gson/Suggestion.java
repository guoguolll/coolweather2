package com.coolweather.android.gson;

/**
 * Created by 刘健 on 2018/6/8.
 */


import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }



    public class CarWash {

        @SerializedName("txt")
        public String info;

    }


    public class Sport {

        @SerializedName("txt")
        public String info;
    }

}