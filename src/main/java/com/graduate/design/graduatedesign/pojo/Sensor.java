package com.graduate.design.graduatedesign.pojo;

/**
 * @author 荒城
 * @title: Sensor
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2618:52
 */
public class Sensor {
    private int senser_id;
    private String sensor_name;
    private Long gmt_create;
    private Long gmt_modified;
    private int user_id;
    private double ava_data;
    private String normal_data;

    public int getSenser_id() {
        return senser_id;
    }

    public void setSenser_id(int senser_id) {
        this.senser_id = senser_id;
    }

    public String getSensor_name() {
        return sensor_name;
    }

    public void setSensor_name(String sensor_name) {
        this.sensor_name = sensor_name;
    }

    public Long getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Long gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Long getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Long gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getAva_data() {
        return ava_data;
    }

    public void setAva_data(double ava_data) {
        this.ava_data = ava_data;
    }

    public String getNormal_data() {
        return normal_data;
    }

    public void setNormal_data(String normal_data) {
        this.normal_data = normal_data;
    }
}
