package com.itheima03;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

import java.util.concurrent.*;

public class ThreadTest06 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        启动方式一的线程
        MyThread01 myThread01 = new MyThread01();
        myThread01.start();

//        启动方式二的线程
        new Thread(new MyThread02()).start();

//        启动方式三的线程
        ExecutorService pool = Executors.newFixedThreadPool(1);//创建一个线程池
        MyThread03 myThread03 = new MyThread03();
        Future<String> future = pool.submit(myThread03); //提交执行线程
        String s = future.get(); //接收执行结果,需要抛出异常
        pool.shutdownNow();//关闭线程池服务

    }
}



//方式一：继承Thread类创建线程
class MyThread01 extends Thread{

    @Override
    public void run() {
        System.out.println("线程1---执行完毕");
    }

}


//方式二：通过实现Runnable接口创建线程
class MyThread02 implements Runnable{

    @Override
    public void run() {
        System.out.println("线程2---执行完毕");
    }

}


//方式三：通过实现Callable接口创建线程
class MyThread03 implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("线程3---执行完毕");
        return null;
    }

}