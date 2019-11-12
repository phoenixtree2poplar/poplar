package com.phoenix.poplar.service.impl;

import com.phoenix.dao.entity.User;
import com.phoenix.dao.mapper.UserMapper;
import com.phoenix.poplar.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public int insert(User record) {
        return userMapper.insert(record);
    }
}