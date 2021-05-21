package com.graduate.design.graduatedesign.Mapper;

import com.graduate.design.graduatedesign.pojo.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 荒城
 * @title: MapMapper
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2923:14
 */
@Mapper
public interface MapMapper {
    @Select("select * from equipment")
    List<Equipment> findAllEqu();
}
