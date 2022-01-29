package com.itheima_01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 构造方法：
 *       public SimpleDateFormat():构造一个SimpleDateFormat，使用默认模式和日期格式；
 *       public SimpleDateFormat(String pattern):构造一个SimpleDateFormat使用给定的模式和默认日期；
 *
 * */
public class SimpleDateFormatDome {
    public static void main(String[] args) throws ParseException {
        //格式化 从Date到String
        Date d = new Date(); //创建一个Date对象，默认初始化为当前时间;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);//将当前时间格式化为自己设定的格式；
        System.out.println(s);//打印出按照设定的格式的时间
        System.out.println("----------------");

        //从String到Date
        //例如我设定个日期
        String ss = "2022-02-02 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);//将我设定的字符串按照这种格进行格式化
        System.out.println(dd);

    }
}
