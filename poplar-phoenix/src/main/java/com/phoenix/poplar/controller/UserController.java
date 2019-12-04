package com.phoenix.poplar.controller;

import com.alibaba.fastjson.JSONObject;
import com.phoenix.common.utils.PoplarResult;
import com.phoenix.dao.entity.User;
import com.phoenix.poplar.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("addUser")
    public PoplarResult addUser(@RequestBody User user) {
        try {
            int result = userService.addUser(user);
            if (1 == result) {
                log.info("---------------------添加用户成功---------------------");
                return PoplarResult.ok(200, "success", "添加用户成功");
            } else {
                log.info("---------------------添加用户失败---------------------");
                return PoplarResult.error("添加用户失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("---------------------添加用户失败---------------------");
            return PoplarResult.error("未知错误，添加用户失败");
        }
    }

    @RequestMapping("deleteUser")
    public PoplarResult deleteUser(@RequestBody User user) {
        try {
            int result = userService.deleteUser(user);
            if (1 == result) {
                log.info("---------------------删除用户成功---------------------");
                return PoplarResult.ok(200, "success", "删除用户成功");
            } else {
                log.info("---------------------删除用户失败---------------------");
                return PoplarResult.error("删除用户失败");
            }
        } catch (Exception e) {
            log.info("---------------------删除用户失败---------------------");
            e.printStackTrace();
            return PoplarResult.error("未知错误，删除用户失败");
        }
    }

    @RequestMapping("updateUser")
    public PoplarResult updateUser(@RequestBody User user) {
        try {
            int result = userService.updateUser(user);
            if (1 == result) {
                log.info("---------------------更新用户成功---------------------");
                return PoplarResult.ok(200, "success", "更新用户成功");
            } else {
                log.info("---------------------更新用户失败---------------------");
                return PoplarResult.error("更新用户失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("---------------------更新用户失败---------------------");
            return PoplarResult.error("未知错误，更新用户失败");
        }
    }

    @GetMapping("queryUserAll")
    public PoplarResult queryUserAll() {
        try {
            List<User> userList = userService.queryUserAll();
            if (Objects.nonNull(userList)) {
                log.info("---------------------查询用户成功---------------------");
                return PoplarResult.ok(200, "success", userList);
            } else {
                log.info("---------------------查询用户失败---------------------");
                return PoplarResult.error("查询用户失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("---------------------查询用户失败---------------------");
            return PoplarResult.error("未知错误，查询用户失败");
        }
    }
}