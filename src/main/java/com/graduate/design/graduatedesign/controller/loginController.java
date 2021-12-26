package com.graduate.design.graduatedesign.controller;

import com.graduate.design.graduatedesign.Service.UserService;
import com.graduate.design.graduatedesign.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 荒城
 * @title: hellocontroller
 * @projectName graduate-design
 * @description: TODO
 * @date 2021/10/1519:42
 */
@Api(tags = "登录类接口")
@Controller
public class loginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录查询接口")
    @ResponseBody
    public String login(@RequestParam("name") @ApiParam("用户名") String name, @RequestParam("Password") @ApiParam("用户密码") String Password){
        User user = userService.findByName(name);

        System.out.print(name);
        System.out.print(Password);
        System.out.print(user.getPassword());
        //这里做一个判断查询，当接受到的用户名所查询的密码，正确返回OK，错误返回False
        if(user.getPassword().equals(Password))
        {
            return "ok";
        }else {
            return "false";
        }
    }
}
