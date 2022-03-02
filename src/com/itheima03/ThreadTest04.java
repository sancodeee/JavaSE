package com.itheima03;
//多个线程同时操作一个对象


//买火车票的例子
public class ThreadTest04 implements Runnable {

    private int ticketNum = 10;

    //    线程体
    @Override
    public void run() {

        while (true) {

            if (ticketNum <= 0) {
                break;
            }

            System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNum-- + "票");
        }

    }

    public static void main(String[] args) {

        ThreadTest04 threadTest04 = new ThreadTest04();

//        创建多个线程
        new Thread(threadTest04, "小明").start();
        new Thread(threadTest04, "小红").start();
        new Thread(threadTest04, "小航").start();


    }

}
