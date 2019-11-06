package com.poplar.controller;

import com.alibaba.fastjson.JSONObject;
import com.poplar.entity.Poplar;
import com.poplar.utils.PoplarResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @RequestMapping("/")
    JSONObject poplar() {
        Poplar poplar = new Poplar();
        poplar.setId(00);
        poplar.setName("sssssssddddddffffffffffffffffffffffdddddddfffffffffffffffffffffffffffffffffffffdddddddsssssf");
        poplar.setAge(25);
        PoplarResult poplarResult = new PoplarResult();
        return new JSONObject(poplarResult.ok("200","success",poplar));
    }
}