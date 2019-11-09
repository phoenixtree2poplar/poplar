package com.phoenix.poplar.controller;

import com.alibaba.fastjson.JSONObject;
import com.phoenix.dao.entity.User;
import com.phoenix.poplar.service.UserService;
import com.phoenix.poplar.utils.PoplarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/addUser")
    public PoplarResult addUser(String user) {
        User insertUser = JSONObject.parseObject(user, User.class);
        int result = userService.insert(insertUser);
        PoplarResult poplarResult = new PoplarResult();
        if (result > 0) {
//            return new JSONObject(poplarResult.ok(200,"success"));
            return null;
        } else {
            return null;
        }
    }


//    JSONObject poplar() {
//        Poplar poplar = new Poplar();
//        poplar.setId(00);
//        poplar.setName("少年张三丰");
//        poplar.setAge(25);
//
//        return new JSONObject(poplarResult.ok("200","success",poplar));
//    }
}
