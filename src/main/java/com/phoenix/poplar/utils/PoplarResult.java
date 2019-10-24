package com.phoenix.poplar.utils;

import java.util.HashMap;

public class PoplarResult extends HashMap<String, Object> {

    public PoplarResult() {
        build("code", 200);
    }

    /**
     * @Description 返回成功结果
     * @Author 梧桐
     */
    public static PoplarResult ok() {
        return new PoplarResult();
    }

    public static PoplarResult ok(String msg) {
        PoplarResult result = new PoplarResult();
        result.put("msg", msg);
        return result;
    }

    public static PoplarResult ok(String code, String msg) {
        PoplarResult result = new PoplarResult();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public PoplarResult ok(String code, String msg, Object data) {
        PoplarResult result = new PoplarResult();
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }

    /**
     * @Description 返回错误
     * @Author 刘俊重
     */
    public static PoplarResult error(int code, String msg) {
        PoplarResult result = new PoplarResult();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public static PoplarResult error() {
        return error(500, "未知错误，请稍后重试!");
    }

    public static PoplarResult error(String msg) {
        return error(500, msg);
    }

    public PoplarResult build(String key, Object value) {
        super.put(key, value);
        return this;
    }
}