package com.itheima03;

import java.util.function.DoubleToIntFunction;

//线程优先级
public class PriorityDemo implements Runnable{

    @Override
    public void run() {
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+"-->优先级为"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
//主线程默认优先级
        System.out.println(Thread.currentThread().getName()+"-->优先级"+Thread.currentThread().getPriority());

        PriorityDemo priorityDemo= new PriorityDemo();

        Thread t1= new Thread(priorityDemo);
        Thread t2 = new Thread(priorityDemo);
        Thread t3 = new Thread(priorityDemo);
        Thread t4 = new Thread(priorityDemo);
        Thread t5 = new Thread(priorityDemo);
        Thread t6 = new Thread(priorityDemo);

        t1.start();     // p1默认优先级，启动p1线程

        t2.setPriority(1);
        t2.start();

        t3.setPriority(4);
        t3.start();

        t4.setPriority(6);
        t4.start();

        t5.setPriority(8);
        t5.start();

        t6.setPriority(10);
        t6.start();

    }

}
