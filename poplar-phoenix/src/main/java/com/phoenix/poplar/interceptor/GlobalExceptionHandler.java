package com.phoenix.poplar.interceptor;

import com.phoenix.common.utils.PoplarResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    // 拦截异常的类型
    @ExceptionHandler(value = Exception.class)
    public PoplarResult exceptionHandler(Exception e) {

        log.info("------未知错误-start-----");
        e.printStackTrace();
        log.info("------未知错误-end-----");

        // 简单返回给服务器
        return PoplarResult.error("未知错误，请稍后重试");
    }
}