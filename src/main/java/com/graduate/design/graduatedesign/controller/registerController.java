package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Mapper.UserMapper;
import com.graduate.design.graduatedesign.Service.UserService;
import com.graduate.design.graduatedesign.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 荒城
 * @title: registerController
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2421:28
 */
@Controller

public class registerController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody

    public String register(@RequestParam("name") String name, @RequestParam("phone") String phone,
                           @RequestParam("email") String email,  @RequestParam("Password") String Password) {
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
