package com.itheima03;

//线程池

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {
    public static void main(String[] args) {

//        1、创建服务，创建线程池
//        newFixedThreadPool  参数为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

//        2、提交执行线程
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

//        3、关闭连接
        service.shutdownNow();

    }
}

//线程体
class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-----线程启动-----");
    }
}
