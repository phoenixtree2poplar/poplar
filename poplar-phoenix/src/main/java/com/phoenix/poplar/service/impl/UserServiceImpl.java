package com.phoenix.poplar.service.impl;

import com.phoenix.dao.entity.User;
import com.phoenix.dao.mapper.UserMapper;
import com.phoenix.poplar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }
}