package com.graduate.design.graduatedesign.pojo;

/**
 * @author 荒城
 * @title: Equipment
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2712:04
 */
public class Equipment {
    private int equ_id;
    private String equipment_name;
    private int user_id;
    private String description;
    private String equ_picture;
    private double lon;
    private double lat;
    private Long gmt_create;
    private Long gmt_modified;

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEqu_picture() {
        return equ_picture;
    }

    public void setEqu_picture(String equ_picture) {
        this.equ_picture = equ_picture;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
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
}
