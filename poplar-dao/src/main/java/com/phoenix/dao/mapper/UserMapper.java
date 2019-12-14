package com.phoenix.dao.mapper;

import com.phoenix.dao.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> queryUserAll();

    int insert(User record);

    int updateByPrimaryKey(User record);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);
}