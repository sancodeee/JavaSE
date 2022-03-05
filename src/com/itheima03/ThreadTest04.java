package com.itheima03;
//多个线程同时操作一个对象


import java.util.concurrent.locks.ReentrantLock;

//买火车票的例子
public class ThreadTest04 implements Runnable {

    private int ticketNum = 10;

//    定义lock锁
    private final ReentrantLock lock = new ReentrantLock(); //加private、final是为了保证安全

    //    线程体
    @Override
    public void run() {

//在数量变化的地方加锁，所以在票数这里加锁

        while (true) {
            try {
                lock.lock();//加锁
                if (ticketNum > 0) {
                    //      模拟网络延时
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNum-- + "票");
                }else {
                    break;
                }
            } finally {
                lock.unlock();
            }

        }

    }


    public static void main(String[] args) {

        ThreadTest04 threadTest04 = new ThreadTest04();

//      创建多个线程
        new Thread(threadTest04, "小明").start();
        new Thread(threadTest04, "小红").start();
        new Thread(threadTest04, "小航").start();


    }

}
