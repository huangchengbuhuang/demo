package com.graduate.design.graduatedesign.dto;

/**
 * @author 荒城
 * @title: MapDto
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/10/2923:09
 */
public class MapDto {
    private String name;
    private double location_X;
    private double location_Y;
    private int equipmentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLocation_X() {
        return location_X;
    }

    public void setLocation_X(double location_X) {
        this.location_X = location_X;
    }

    public double getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(double location_Y) {
        this.location_Y = location_Y;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }
}
