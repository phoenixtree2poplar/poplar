package com.phoenix.poplar.service;

import com.phoenix.dao.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> queryUserAll(Integer pageNum, Integer pageSize);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int userId);
}