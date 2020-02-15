package com.lingyun.controller;

import com.lingyun.bean.User;
import com.lingyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * user 控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public User checkUser(@RequestParam("username") String name, String password){
        User one = null;
        if(name!=null && password!=null){
            one = userService.findOne(name, password);
        }
        return one;
    }
}
