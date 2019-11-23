package com.phoenix.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtil {

    /**
     * 获得当前时间 timeFormat 格式：2015-08-21 21:21:21
     *
     * @return String
     */
    public static String getCurrentTime() {
        String timeFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(timeFormat);
        Date date = new Date();
        return yyyyMMddHHmmss.format(date);
    }
}