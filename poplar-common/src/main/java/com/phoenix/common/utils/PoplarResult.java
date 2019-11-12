package com.phoenix.common.utils;

import java.util.HashMap;

/**
 * @author wutong  2019/8/12  wu_ton-g@foxmail.com
 * @Description 统一返回结果
 */
public class PoplarResult extends HashMap<String, Object> {

    /**
     * @Description 返回成功结果
     */
    public static PoplarResult ok(int code, String msg, Object data) {
        PoplarResult result = new PoplarResult();
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }

    /**
     * @return PoplarResult
     */
    public static PoplarResult ok() {
        return PoplarResult.ok(200, null, null);
    }

    /**
     * @param msg 状态信息
     * @return PoplarResult
     */
    public static PoplarResult ok(String msg) {
        return PoplarResult.ok(200, msg, null);
    }

    /**
     * @param code 状态码
     * @param msg  状态信息
     * @return PoplarResult
     */
    public static PoplarResult ok(int code, String msg) {
        return PoplarResult.ok(code, msg, null);
    }

    /**
     * @Description 返回错误
     */
    public static PoplarResult error(int code, String msg) {
        PoplarResult result = new PoplarResult();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    /**
     * @return PoplarResult
     */
    public static PoplarResult error() {
        return error(500, "未知错误，请稍后重试!");
    }

    /**
     * @param msg 状态信息
     * @return PoplarResult
     */
    public static PoplarResult error(String msg) {
        return error(500, msg);
    }
}