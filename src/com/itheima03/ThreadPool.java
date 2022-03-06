package com.itheima03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable{

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(10);//创建线程池
        for (int i = 0; i < 10; i++) {

//            提交多个线程任务并执行
            threadPool.execute(new ThreadPool());


        }

    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行啦");
    }
}
