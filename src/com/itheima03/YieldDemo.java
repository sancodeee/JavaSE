package com.itheima03;

//线程礼让
import java.util.concurrent.ThreadLocalRandom;

public class YieldDemo implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"线程开始运行");
        Thread.yield();//线程礼让
        System.out.println(Thread.currentThread().getName()+"线程停止运行");

    }

    public static void main(String[] args) {

        YieldDemo yieldDemo = new YieldDemo();

        new Thread(yieldDemo,"a").start();
        new Thread(yieldDemo,"b").start();

    }


}
