package com.graduate.design.graduatedesign.Service;

import com.graduate.design.graduatedesign.pojo.Equipment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 荒城
 * @title: EquipmentService
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2712:04
 */
@Service
public interface EquipmentService {
  //  Equipment findById(int id);

    boolean deleteByEquipmentId(int equipmentId);

    boolean insertEquipment(Equipment equipment);

//查询一个用户端所有的设备
    List<Equipment> findByIdlist(int id);
}
