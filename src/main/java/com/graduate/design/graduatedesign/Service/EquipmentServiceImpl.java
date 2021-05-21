package com.graduate.design.graduatedesign.Service;

import com.graduate.design.graduatedesign.Mapper.EquipmentMapper;
import com.graduate.design.graduatedesign.pojo.Equipment;
import com.graduate.design.graduatedesign.pojo.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 荒城
 * @title: EquipmentServiceImpl
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2712:08
 */
@Service
public class EquipmentServiceImpl implements EquipmentService{

    @Autowired
   private EquipmentMapper equipmentMapper;
   /* @Override
    public Equipment findById(int id) {
        Equipment equipment=equipmentMapper.findByUserId(id);

        return equipment;
    }
*/
    @Override
    public boolean deleteByEquipmentId(int equipmentId) {

        return equipmentMapper.deleteByEquipmentId(equipmentId);
    }

    @Override
    public boolean insertEquipment(Equipment equipment) {
        return  equipmentMapper.insertEquipment(equipment);


    }

    @Override
    public List<Equipment> findByIdlist(int id) {
       List<Equipment>  equipmentlist=equipmentMapper.findByIdlist(id);
        return equipmentlist;


    }

}
