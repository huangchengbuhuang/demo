package com.graduate.design.graduatedesign.Mapper;

import com.graduate.design.graduatedesign.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 荒城
 * @title: UserMapper
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/10/2519:19
 */
@Mapper
public interface UserMapper {
  /*  @Options(useGeneratedKeys = true,keyProperty = "ID",keyColumn = "ID")*/
    @Insert("insert into user (name,phone,email,Password,gmt_create,gmt_modified) values (#{name},#{phone},#{email},#{Password},#{gmtCreate},#{gmtModified})")
     void insert(User user);
    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

}
