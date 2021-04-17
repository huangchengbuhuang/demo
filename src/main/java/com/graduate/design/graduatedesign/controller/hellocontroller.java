package com.graduate.design.graduatedesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 荒城
 * @title: hellocontroller
 * @projectName graduate-design
 * @description: TODO
 * @date 2021/4/1519:42
 */
@Controller
public class hellocontroller {

    public String hello(){
        return "hello";
    }
}
