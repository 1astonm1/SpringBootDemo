package com.astonm.springbootdemo.dao;


import com.astonm.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserMapperExt extends UserMapper {

    public List<User> findAllUsers();

}
