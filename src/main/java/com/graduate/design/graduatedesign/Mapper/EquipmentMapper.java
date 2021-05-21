package com.graduate.design.graduatedesign.Mapper;

import com.graduate.design.graduatedesign.pojo.Equipment;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 荒城
 * @title: EquipmentMapper
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2712:04
 */
@Mapper
public interface EquipmentMapper {
   /* @Select("select * from equipment where user_id = #{id}")
    Equipment findByUserId(@Param("id")int id);*/
    //删除操作
    @Delete("delete from equipment where equ_id = #{equipmentId}")
    boolean deleteByEquipmentId(int equipmentId);
    @Insert("insert into equipment (equipment_name,user_id,description,equ_picture,lon,lat,gmt_create,gmt_modified) values " +
            "(#{equipment_name},#{user_id},#{description},#{equ_picture},#{lon},#{lat},#{gmt_create},#{gmt_modified})")
    boolean insertEquipment(Equipment equipment);
    //查询一个用户所有的设备
    @Select("select * from equipment where user_id = #{id}")
    List<Equipment> findByIdlist(@Param("id") int id);
}
