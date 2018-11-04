package com.xh.xiaoyiduo.dao;

import com.xh.xiaoyiduo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUser(Long id);
    public void delUser(Long id);
    public Integer insertUser(Long id, String userName, String age);
}
