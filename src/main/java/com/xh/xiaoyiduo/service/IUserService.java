package com.xh.xiaoyiduo.service;

import com.xh.xiaoyiduo.pojo.User;

public interface IUserService {
    public User getUser(Long id);
    public void delUser(Long id);
    public void insertUser(Long id, String userName, String age);
}
