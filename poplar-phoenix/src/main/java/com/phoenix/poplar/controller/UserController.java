package com.phoenix.poplar.controller;

import com.alibaba.fastjson.JSONObject;
import com.phoenix.common.utils.PoplarResult;
import com.phoenix.dao.entity.User;
import com.phoenix.poplar.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public PoplarResult insert(@RequestBody String str) {
        User  user = JSONObject.parseObject(str,User.class);
        try {
            userService.insert(user);
            log.info("---------------------添加用户成功---------------------");
            return PoplarResult.ok(200, "success", "添加用户成功");
        } catch (Exception e) {
            log.info("---------------------添加用户失败---------------------");
            return PoplarResult.error("添加用户失败");
        }
    }
}