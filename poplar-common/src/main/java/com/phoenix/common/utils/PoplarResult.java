package com.phoenix.common.utils;

import lombok.Data;

/**
 * @author wutong  2019/8/12  wu_ton-g@foxmail.com
 * @Description 统一返回结果
 */
@Data
public class PoplarResult<T> {

    private int code;
    private String msg;
    private T data;

    /**
     * @Description 统一返回结果
     */
    private PoplarResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @return PoplarResult
     * @Description 返回成功结果
     */
    public static PoplarResult ok() {
        return new PoplarResult<>(200, null, null);
    }

    /**
     * @param msg 状态信息
     * @return PoplarResult
     * @Description 返回成功结果
     */
    public static PoplarResult ok(String msg) {
        return new PoplarResult<>(200, msg, null);
    }

    /**
     * @param code 状态码
     * @param msg  状态信息
     * @return PoplarResult
     * @Description 返回成功结果
     */
    public static PoplarResult ok(int code, String msg) {
        return new PoplarResult<>(code, msg, null);
    }

    /**
     * @param code 状态码
     * @param msg  状态信息
     * @param data 返回数据
     * @return PoplarResult
     * @Description 返回成功结果
     */
    public static <T> PoplarResult ok(int code, String msg, T data) {
        return new PoplarResult<>(code, msg, data);
    }

    /**
     * @return PoplarResult
     * @Description 返回错误结果
     */
    public static PoplarResult error() {
        return new PoplarResult<>(500, null, null);
    }

    /**
     * @param msg 状态信息
     * @return PoplarResult
     * @Description 返回错误结果
     */
    public static PoplarResult error(String msg) {
        return new PoplarResult<>(500, msg, null);
    }

    /**
     * @param code 状态码
     * @param msg  状态信息
     * @return PoplarResult
     * @Description 返回错误结果
     */
    public static PoplarResult error(int code, String msg) {
        return new PoplarResult<>(code, msg, null);
    }

    /**
     * @param code 状态码
     * @param msg  状态信息
     * @param data 返回数据
     * @return PoplarResult
     * @Description 返回错误结果
     */
    public static <T> PoplarResult error(int code, String msg, T data) {
        return new PoplarResult<>(code, msg, data);
    }
}