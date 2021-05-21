package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Mapper.SensorMapper;
import com.graduate.design.graduatedesign.Service.SensorService;
import com.graduate.design.graduatedesign.dto.SensorDto;

import com.graduate.design.graduatedesign.pojo.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 荒城
 * @title: SensorCtroller
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2618:42
 */
//从这里查看传感器的数据

@Controller
public class SensorCtroller {
    @Autowired
    private SensorService sensorService;
    @Autowired
    private SensorMapper sensorMapper;
    @RequestMapping("/sensor")
    @ResponseBody
    public Map<String,Object> SensorGetPage(@RequestParam(value = "pageNum",required = true) Integer pageNum,
                                            @RequestParam(value = "pageSize",required = true) Integer pageSize
    ){
        System.out.print(pageNum+pageSize);

      Map<String,Object>  sensormaps=sensorService.SensorGetPage(5,6);
        return sensormaps;
    }
    @RequestMapping("/Sensor")
    @ResponseBody
    public String RealTimedata( ){

        return "ok";
    }

    @RequestMapping("/sensor/test")
    @ResponseBody
    public Sensor test(@RequestParam("id") int id){

        Sensor sensor=  sensorMapper.findByIdlist( id);
        return sensor;
    }
}
