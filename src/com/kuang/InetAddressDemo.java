package com.kuang;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException {
//      查询本机地址
        InetAddress inetAddress01 = InetAddress.getByName("127.0.0.1");
        System.out.println(inetAddress01);

        InetAddress inetAddress02 = InetAddress.getByName("localhost");
        System.out.println(inetAddress02);

        InetAddress inetAddress03 = InetAddress.getLocalHost();
        System.out.println(inetAddress03);

//        查询网站IP地址
        InetAddress inetAddress04 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress04);

//      常用方法
//      System.out.println(InetAddress.getByAddress());
        System.out.println(inetAddress04.getCanonicalHostName());//规范的名字
        System.out.println(inetAddress04.getHostAddress());//ip
        System.out.println(inetAddress04.getHostName());//域名或者自己电脑的名字
    }

}

