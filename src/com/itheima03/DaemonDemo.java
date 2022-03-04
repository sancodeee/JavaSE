package com.itheima03;


import com.sun.org.apache.bcel.internal.generic.GOTO;

public class DaemonDemo {

    public static void main(String[] args) {

        God god = new God();
        You you = new You();

        Thread godthread = new Thread(god);
        godthread.setDaemon(true);//将上帝线程设置为守护线程
        godthread.start();//启动上帝线程

        new Thread(you).start();//启动 你 线程


        
    }

}
//上帝
class God implements Runnable{
    
    @Override
    public void run() {
       while (true){
           System.out.println("上帝保佑着你----");
       }
    }
    
}
//你
class You implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 36500; i++) {

            System.out.println("你开心的活着");

        }

        System.out.println("----------------你去见上帝去了------------------");

    }
}