package com.house.demo.house_demo.controller;

import com.house.demo.house_demo.common.model.User;
import com.house.demo.house_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/16 21:07
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public List<User> getUsers(){
        return userService.getUsers();
    }


}
