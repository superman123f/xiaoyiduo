package com.xh.xiaoyiduo.controller;

import com.xh.xiaoyiduo.pojo.User;
import com.xh.xiaoyiduo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/test")
public class UserController {

    @Autowired
    private IUserService userService = null;

    @RequestMapping("/getUser")
    @ResponseBody
    private User getUser(Long id){
        System.out.println("调用Service层...");
        return userService.getUser(id);
    }

    @RequestMapping("/delUser")
    private void delUser(Long id){
        userService.delUser(id);
    }

    @RequestMapping("/insertUser")
    public void insertUser(Long id, String userName, String age){
        userService.insertUser(id, userName, age);
    }

}
