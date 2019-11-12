package com.phoenix.poplar.service;

import com.phoenix.dao.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int insert(User record);
}
