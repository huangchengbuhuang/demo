package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Service.MapService;
import com.graduate.design.graduatedesign.dto.MapDto;
import com.graduate.design.graduatedesign.pojo.Equipment;
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
 * @date 2021/4/2615:07
 */
@Controller
public class MapCtroller {
    @Autowired
    private MapService mapService;
    @RequestMapping("/map")
    @ResponseBody
    public List<MapDto> Map(){
        List<MapDto> mapDtoList =  mapService.findAllEqu();

        return mapDtoList;
    }
}
