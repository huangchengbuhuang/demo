package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Mapper.UserMapper;
import com.graduate.design.graduatedesign.Service.UserService;
import com.graduate.design.graduatedesign.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 荒城
 * @title: registerController
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/10/2421:28
 */
@Api(tags = "注册类接口")
@Controller

public class registerController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ApiOperation("用户注册接口")
    @ResponseBody

    public String register(@ApiParam("用户名") @RequestParam("name") String name, @RequestParam("phone") @ApiParam("用户手机号") String phone,
                           @RequestParam("email") @ApiParam("用户邮箱") String email, @RequestParam("Password") @ApiParam("用户密码") String Password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(Password);
        user.setPhone(phone);
        user.setGmtCreate(System.currentTimeMillis());
        user.setGmtModified(user.getGmtCreate());
        userMapper.insert(user);
        return "ok";
    }
}
