package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Service.EquipmentService;
import com.graduate.design.graduatedesign.pojo.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 荒城
 * @title: EquipmentCtroller
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2712:00
 */

@Controller

public class EquipmentController {
    @Autowired
   private EquipmentService equipmentService;

    @RequestMapping( value = "/Equipment",method = RequestMethod.POST)
    @ResponseBody
    public List<Equipment> Equipment(@RequestParam("id") int id){
        //System.out.print(id);
       List<Equipment> equipments= equipmentService.findByIdlist(id);

      // Equipment equipmentss=equipmentService.findById(id);

        //设备ID 名称  创建时间 简介
        List<Equipment> equipmentlist = new ArrayList<>();
        for(Equipment equipment :equipments){
            equipmentlist.add(equipment);
        }

        return equipmentlist;
    }

    @RequestMapping("/Equipment/del")
    @ResponseBody
    /*获取设备的id然后将设备进行删除*/
    public String deleteEquipment(@RequestParam("equipmentId") int equipmentId){
      boolean result=  equipmentService.deleteByEquipmentId(equipmentId);
     if(result){
         return "COMMPN_SUC";
     }else {
         return "Equipment_DEL_ERROR";
     }
    }

    //进行设备的添加
    @RequestMapping(value = "/Equipment/add",method = RequestMethod.POST)
    @ResponseBody
    public String addEquipment(@RequestParam("imgUrl") String imgUrl,@RequestParam("info") String info,@RequestParam("location_X") double location_X,@RequestParam("location_Y") double location_Y,
                               @RequestParam("name") String name,@RequestParam("userId") int userId,@RequestParam("isPublic") boolean isPublic){
        Equipment equipment = new Equipment();
        equipment.setEqu_picture(imgUrl);
        equipment.setDescription(info);
        equipment.setLon(location_X);
        equipment.setLat(location_Y);
        equipment.setEquipment_name(name);
        equipment.setUser_id(userId);
        equipment.setGmt_create(System.currentTimeMillis());
        equipment.setGmt_modified(equipment.getGmt_create());
       boolean result= equipmentService.insertEquipment(equipment);

        if(result){
            return "COMMPN_SUC";
        }else {
            return "Equipment_ADD_ERROR";
        }

    }

}
