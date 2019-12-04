package com.phoenix.poplar.service;

import com.phoenix.dao.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    int addUser(User user);

    int deleteUser(User user);

    int updateUser(User user);

    List<User> queryUserAll();
}