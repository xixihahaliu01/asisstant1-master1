package com.ustc.sse.asisstant.entity;

/**
 * Created by Thinkpad on 2017/2/20.
 */

public class Restaurant {

    private String resterant_name;
    private String price_avg;
    private String mark;
    private String district;
    private int image;
    private char type;  //c中餐  w西餐  d甜品  f快餐
    private double jingdu;
    private double weidu;

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getResterant_name() {
        return resterant_name;
    }

    public void setResterant_name(String resterant_name) {
        this.resterant_name = resterant_name;
    }

    public String getPrice_avg() {
        return price_avg;
    }

    public void setPrice_avg(String price_avg) {
        this.price_avg = price_avg;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getJingdu() {
        return jingdu;
    }

    public void setJingdu(double jingdu) {
        this.jingdu = jingdu;
    }

    public double getWeidu() {
        return weidu;
    }

    public void setWeidu(double weidu) {
        this.weidu = weidu;
    }
}
