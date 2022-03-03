package com.itheima03;

public class threadTest01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("---------线程体执行中--------"+i);
        }
    }


    public static void main(String[] args) {

//        创建线程对象
        threadTest01 th = new threadTest01();
//        通过线程对象启动线程
        th.start();          //调用start()方法时并行执行

        for (int i = 0; i < 200; i++) {
            System.out.println("---------主线程执行中----------"+i);
        }
    }
}