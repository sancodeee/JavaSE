package com.itheima03;

public class threadStop implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("running......thread" + i++);
        }

    }

    //    设置一个公开的方法停止线程
    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {

        threadStop threadStop = new threadStop();
        new Thread(threadStop).start();//启动线程

        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            if (i == 900) {
                threadStop.stop();  //调用stop方法让该线程停止
                System.out.println("-------该线程停止了------");
            }

        }

    }

}
