package com.itheima03;

//线程插队合并
public class JoinDemo implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            System.out.println("vip线程插队执行，其他线程阻塞----！"+i);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        JoinDemo joinDemo = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.start();


        for (int i = 0; i < 100; i++) {

            if (i==50){
                thread.join(); //main线程阻塞
            }
            System.out.println("主线程执行中---"+i);
        }

    }
}
