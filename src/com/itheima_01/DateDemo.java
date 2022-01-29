package com.itheima_01;

import org.omg.CORBA.DATA_CONVERSION;

import java.text.ParseException;
import java.util.Date;

/*
* 测试类
* */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();//获取当前时间
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");//通过dateToString方法将日期格式转换为字符串格式并赋值给s1
        System.out.println(s1);//打印出s1

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s = "2022-02-02 11:11:11";
        Date dd = DateUtils.stringToDate(s,"yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);


    }
}
