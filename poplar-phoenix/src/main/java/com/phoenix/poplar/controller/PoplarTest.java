package com.phoenix.poplar.controller;

import com.phoenix.common.utils.PoplarResult;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class PoplarTest {
    @RequestMapping("/")
    PoplarResult poplarTest() {
        return PoplarResult.ok(500, "错误", "必要的测试");
    }

    public static void main(String[] args) {
        int code = 456;
        String msg = "成功";
        String data = "失败";
        log.info("---------------------成功---------------------");
        System.out.println(PoplarResult.ok());
        System.out.println(PoplarResult.ok(msg));
        System.out.println(PoplarResult.ok(code, msg));
        System.out.println(PoplarResult.ok(code, msg, data));
        log.info("---------------------失败---------------------");
        System.out.println(PoplarResult.error());
        System.out.println(PoplarResult.error(msg));
        System.out.println(PoplarResult.error(code, msg));
        System.out.println(PoplarResult.error(code, msg, data));
    }
}