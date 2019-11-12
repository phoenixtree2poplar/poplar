package com.phoenix.poplar.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int insert(User record);
}
