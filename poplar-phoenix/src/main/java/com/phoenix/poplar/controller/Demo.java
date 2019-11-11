package com.phoenix.poplar.controller;

import com.phoenix.dao.entity.Poplar;
import com.phoenix.poplar.utils.PoplarResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @RequestMapping("/")
    PoplarResult poplar() {
        Poplar poplar = new Poplar();
        poplar.setId(00);
        poplar.setName("少年张三丰");
        poplar.setAge(25);
        return PoplarResult.ok(200,"success");
    }
}