package com.itheima_01;
/*
工具类：
* 构造方法私有
* 成员方法静态
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){}
    /*
    * 把 日期 转换为指定格式的 字符串
    * */
    public static String dateToString(Date date, String format)  {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }
    /*
    * 把 字符串 转换为指定格式的 日期
    * */
    public static Date stringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }
}
