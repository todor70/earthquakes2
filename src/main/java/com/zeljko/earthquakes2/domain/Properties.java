package com.zeljko.earthquakes2.domain;

public class Properties {

    private double  mag;
    private String place;
    private long time;
    private String url;

    public Properties() {
    }

    public double getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public long getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }

    public void setMag(double mag) {
        this.mag = mag;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}