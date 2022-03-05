package com.itheima03;


//死锁
public class DeadLock {
    public static void main(String[] args) {

        Makeup m1 = new Makeup(0,"小红");
        Makeup m2 = new Makeup(1,"小明");

        new Thread(m1).start();//线程小红启动
        new Thread(m2).start();//线程小明启动

    }
}

//口红
class Lipstick{

}

//镜子
class Mirror{

}

class Makeup extends Thread{
    //用static修饰来保证只有一个口红和一个镜子
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice ;//选择执行的类型
    String girlName;//要化妆的人类

//    化妆类构造方法
    Makeup(int choice,String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }


//    化妆线程
    @Override
    public void run() {
//        化妆
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//    化妆方法 同步块锁住口红和镜子的资源，且两个线程对象互相需要对方的资源，所以会发生死锁
//    解决死锁方法，只需破坏请求并保持的条件即可 例如：把内部的锁从外部取出来
    private void makeup() throws InterruptedException {
        if(choice==0){
            synchronized (lipstick){
                System.out.println(this.girlName+"获得了口红的锁");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(this.girlName+"获得镜子的锁");
                }

            }

        }else {
            synchronized (mirror){
                System.out.println(this.girlName+"获得镜子的锁");
                sleep(2000);
                synchronized (lipstick){
                    System.out.println(this.girlName+"获得口红的锁");
                }
            }

        }
    }

}