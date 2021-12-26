package com.graduate.design.graduatedesign.Mapper;

import com.graduate.design.graduatedesign.pojo.Sensor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 荒城
 * @title: SensorMapper
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/10/2618:55
 */
@Mapper
public interface SensorMapper {
@Select("select count(*) from sensor  ")
    Integer findAllCount();


@Select("select  * from  SENSOR limit #{limit},#{offset}")
    List<Sensor> SensorGetPage(@Param("limit") int limit, @Param("offset") int offset);

@Select("select * from sensor where senser_id=#{id}")
    Sensor findByIdlist(@Param("id") int id);
}
