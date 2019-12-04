package com.phoenix.poplar.service.impl;

import com.phoenix.dao.entity.User;
import com.phoenix.dao.mapper.UserMapper;
import com.phoenix.poplar.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUser(User user) {
        return userMapper.deleteByPrimaryKey(user.getId());
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<User> queryUserAll() {
        return userMapper.queryUserAll();
    }
}