package com.itheima03;
//线程休眠，阻塞当前线程
//模拟倒计时

import com.itheima_01.SimpleDateFormatDome;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepDemo {

    public static void main(String[] args) {

        SleepDemo sp = new SleepDemo();
//        模拟倒计时
//        try {
//            sp.tenDown();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        打印当前系统时间
        Date startTime = new Date(System.currentTimeMillis());//获取当前系统时间
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis()); //更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void tenDown() throws InterruptedException {

        int num = 10;
        while (true){

            Thread.sleep(1000);
            System.out.println(num--);
            if (num<0){
                break;
            }
        }
    }

}
