package com.phoenix.poplar.controller;

import com.alibaba.fastjson.JSONObject;
import com.phoenix.common.utils.PoplarResult;
import com.phoenix.dao.entity.User;
import com.phoenix.poplar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public PoplarResult insert(@RequestBody String user) {
        User  insertUser = JSONObject.parseObject(user,User.class);
        int result = userService.insert(insertUser);
        if (result > 0) {
            return PoplarResult.ok(200, "success", "插入用户成功");
        } else {
            return null;
        }
    }
}