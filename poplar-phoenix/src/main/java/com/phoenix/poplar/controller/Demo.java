package com.phoenix.poplar.controller;

import com.alibaba.fastjson.JSONObject;
import com.phoenix.dao.entity.Poplar;
import com.phoenix.poplar.utils.PoplarResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @RequestMapping("/")
    JSONObject poplar() {
        Poplar poplar = new Poplar();
        poplar.setId(00);
        poplar.setName("少年张三丰");
        poplar.setAge(25);
        PoplarResult poplarResult = new PoplarResult();
        return new JSONObject(poplarResult.ok("200","success",poplar));
    }
}