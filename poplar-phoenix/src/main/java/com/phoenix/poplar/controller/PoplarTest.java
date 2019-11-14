package com.phoenix.poplar.controller;

import com.phoenix.common.utils.PoplarResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoplarTest {
    @RequestMapping("/")
    PoplarResult poplarTest() {
        return PoplarResult.ok(500,"错误","必要的测试");
    }
}