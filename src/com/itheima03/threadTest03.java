package com.itheima03;

//实现Runnable接口

public class threadTest03 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("---------线程体执行中--------"+i);
        }
    }

    public static void main(String[] args) {

//        创建实现Runable接口类的对象
        threadTest03 threadtest = new threadTest03();

//        创建线程对象,然后将threadtest抛入线程类对象中
        Thread th = new Thread(threadtest);

//        通过线程类对象启动线程
        th.start();
//

        for (int i = 0; i < 200; i++) {
            System.out.println("---------主线程执行中----------"+i);
        }
    }
}
