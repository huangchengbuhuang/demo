package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Service.MapService;
import com.graduate.design.graduatedesign.dto.MapDto;
import com.graduate.design.graduatedesign.pojo.Equipment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 荒城
 * @title: MapCtroller
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/10/2615:07
 */
@Api(tags = "地图类类接口")
@Controller
public class MapCtroller {
    @Autowired
    private MapService mapService;
    @RequestMapping("/map")
    @ApiOperation(value = "设备的地图查询接口")
    @ResponseBody
    public List<MapDto> Map(){
        List<MapDto> mapDtoList =  mapService.findAllEqu();

        return mapDtoList;
    }
}
