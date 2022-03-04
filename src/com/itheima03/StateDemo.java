package com.itheima03;


//测试线程状态转换
public class StateDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(()->{  //lamda表达式，将自定义线程类对象直接放入Thread类对象中
            for (int i = 0; i < 10; i++) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("END!!");
        });

        //观察线程状态
        Thread.State state = thread.getState();
        System.out.println(state);  //NEW

        //观察启动后的线程状态
        thread.start();//启动线程
        state = thread.getState();
        System.out.println(state);//RUNNING

        //观察线程终止后的状态
        while (state != Thread.State.TERMINATED){

            Thread.sleep(10);
            state = thread.getState();
            System.out.println(state);

        }

    }

}
