package com.example.lenovo.earthquake;

/**
 * Created by LENOVO on 25/10/2016.
 */

public class QuakeObject {


    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public QuakeObject(String mMagnitude,String mLocation,String mDate){
        this.mMagnitude=mMagnitude;
        this.mLocation=mLocation;
        this.mDate=mDate;

    }


    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }




}
