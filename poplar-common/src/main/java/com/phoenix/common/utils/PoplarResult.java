package com.phoenix.common.utils;

/**
 * @author wutong  2019/8/12  wu_ton-g@foxmail.com
 * @Description 统一返回结果
 */
public class PoplarResult<T> {

    private int code;
    private String msg;
    private T data;

    /**
     * @Description 返回成功结果
     */
    private PoplarResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @return PoplarResult
     */
    public static PoplarResult ok() {
        return new PoplarResult<>(200, null, null);
    }

    /**
     * @param msg 状态信息
     * @return PoplarResult
     */
    public static PoplarResult ok(String msg) {
        return new PoplarResult<>(200, msg, null);
    }

    /**
     * @return PoplarResult
     */
    public static PoplarResult ok(int code, String msg) {
        return new PoplarResult<>(code, msg, null);
    }

    /**
     * @param code 状态码
     * @param msg  状态信息
     * @param data 返回数据
     * @return PoplarResult
     */
    public static <T> PoplarResult ok(int code, String msg, T data) {
        return new PoplarResult<>(code, msg, data);
    }

    /**
     * @Description 返回错误
     */
    private PoplarResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * @return PoplarResult
     */
    public static PoplarResult error() {
        return new PoplarResult<>(500, "未知错误，请稍后重试");
    }

    /**
     * @param msg 状态信息
     * @return PoplarResult
     */
    public static PoplarResult error(String msg) {
        return new PoplarResult<>(500, msg);
    }

    /**
     * @param code 状态码
     * @param msg  状态信息
     * @return PoplarResult
     */
    public static PoplarResult error(int code, String msg) {
        return new PoplarResult<>(code, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}