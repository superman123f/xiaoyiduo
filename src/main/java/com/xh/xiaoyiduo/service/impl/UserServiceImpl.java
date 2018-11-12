package com.xh.xiaoyiduo.service.impl;

import com.xh.xiaoyiduo.dao.UserMapper;
import com.xh.xiaoyiduo.pojo.User;
import com.xh.xiaoyiduo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper = null;



    @Override
    public User getUser(Long id) {
        System.out.println("调用dao层...");
        return userMapper.getUser(id);
    }

    @Override
    public void delUser(Long id) {
        userMapper.delUser(id);
    }

    @Override
    public void insertUser(Long id, String userName, String age) {
        Long _id = id;
        String name = userName;
        String _age = age;

//        userMapper.insertUser(id, userName, age);
    }
//    @Override
//    public void insertUser(Long id, String userName, String age) {
//        userMapper.insertUser(id, userName, age);
//    }
}
