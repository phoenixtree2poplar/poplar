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
    public static <T> PoplarResult ok(int code, String msg, T data) {
        PoplarResult result = new PoplarResult();
        this.code = code;
        this.msg = msg;
        this.data = data;
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
        this.code = code;
        this.msg = msg;
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