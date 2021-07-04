package com.astonm.springbootdemo.service.impl;

import com.astonm.springbootdemo.dao.UserMapper;
import com.astonm.springbootdemo.dao.UserMapperExt;
import com.astonm.springbootdemo.pojo.User;
import com.astonm.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Astonm
 * @Date 2021/7/4
 * @Description:
 **/

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapperExt userMapperExt;

    @Override
    public List<User> findAllUser() {
        List<User> allUsers = userMapperExt.findAllUsers();
        return allUsers;
    }
}
