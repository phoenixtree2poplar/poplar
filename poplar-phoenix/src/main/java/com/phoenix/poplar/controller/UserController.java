package com.phoenix.poplar.controller;

import com.github.pagehelper.PageInfo;
import com.phoenix.common.constant.Constants;
import com.phoenix.common.utils.PoplarResult;
import com.phoenix.dao.entity.User;
import com.phoenix.poplar.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/rest/v1", produces = "application/json;charset=utf-8")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("查询用户")
    @GetMapping("/user")
    public PoplarResult queryUserAll(@RequestParam(required = false, defaultValue = Constants.PAGE_NUM) Integer pageNum,
                                     @RequestParam(required = false, defaultValue = Constants.PAGE_SIZE) Integer pageSize) {
        List<User> users = userService.queryUserAll(pageNum, pageSize);
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        log.info("---------------------查询用户成功---------------------");
        return PoplarResult.ok(200, "success", userPageInfo);
    }

    @ApiOperation("添加用户")
    @PostMapping("/user")
    public PoplarResult addUser(@RequestBody User user) {
        int result = userService.addUser(user);
        if (1 == result) {
            log.info("---------------------添加用户成功---------------------");
            return PoplarResult.ok(200, "success", "添加用户成功");
        } else {
            log.info("---------------------添加用户失败---------------------");
            return PoplarResult.error("添加用户失败");
        }
    }

    @ApiOperation("更新用户")
    @PutMapping("/user")
    public PoplarResult updateUser(@RequestBody User user) {
        int result = userService.updateUser(user);
        if (1 == result) {
            log.info("---------------------更新用户成功---------------------");
            return PoplarResult.ok(200, "success", "更新用户成功");
        } else {
            log.info("---------------------更新用户失败---------------------");
            return PoplarResult.error("更新用户失败");
        }
    }

    @ApiOperation("删除用户")
    @DeleteMapping("/user/{userId}")
    public PoplarResult deleteUser(@PathVariable("userId") int userId) {
        int result = userService.deleteUser(userId);
        if (1 == result) {
            log.info("---------------------删除用户成功---------------------");
            return PoplarResult.ok(200, "success", "删除用户成功");
        } else {
            log.info("---------------------删除用户失败---------------------");
            return PoplarResult.error("删除用户失败");
        }
    }
}