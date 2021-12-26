package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Mapper.SensorMapper;
import com.graduate.design.graduatedesign.Service.SensorService;
import com.graduate.design.graduatedesign.dto.SensorDto;

import com.graduate.design.graduatedesign.pojo.Sensor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
 * @date 2021/10/2618:42
 */
//从这里查看传感器的数据
@Api(tags = "传感器类接口")
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
    @ApiOperation(value = "设备的实时数据查询接口")
    @ResponseBody
    public String RealTimedata( ){

        return "ok";
    }

    @RequestMapping("/sensor/test")
    @ApiOperation(value = "设备的传感器查询接口")
    @ResponseBody
    public Sensor test(@RequestParam("id") int id){

        Sensor sensor=  sensorMapper.findByIdlist( id);
        return sensor;
    }
}
