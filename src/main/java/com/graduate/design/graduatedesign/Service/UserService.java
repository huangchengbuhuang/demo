package com.graduate.design.graduatedesign.Service;

import com.graduate.design.graduatedesign.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author 荒城
 * @title: UserService
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2522:16
 */
@Service
public interface UserService {
    public User findByName(String name);


}
