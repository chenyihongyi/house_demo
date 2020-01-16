package com.house.demo.house_demo.service;

import com.house.demo.house_demo.common.model.User;
import com.house.demo.house_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/16 21:11
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.selectUsers();
    }

}
