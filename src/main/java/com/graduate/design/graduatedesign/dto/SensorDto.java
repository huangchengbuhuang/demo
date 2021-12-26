package com.graduate.design.graduatedesign.dto;

import java.util.Date;

/**
 * @author 荒城
 * @title: SensorDto
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/10/2816:29
 */
public class SensorDto {
    private String name;
    private  String dataLimit;
    private double data;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataLimit() {
        return dataLimit;
    }

    public void setDataLimit(String dataLimit) {
        this.dataLimit = dataLimit;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
