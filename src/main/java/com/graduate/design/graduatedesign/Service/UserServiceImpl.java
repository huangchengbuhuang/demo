package com.graduate.design.graduatedesign.Service;

import com.graduate.design.graduatedesign.Mapper.UserMapper;
import com.graduate.design.graduatedesign.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 荒城
 * @title: UserServiceImpl
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2522:16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByName(String name) {
       User user= userMapper.findByName(name);
        return user;
    }
}
