package com.itheima03;

//不安全买票
//运行结果有-1，说明线程不安全，若是线程安全则不可能有负数
public class UnsafetyBuy {

    public static void main(String[] args) {

        BuyTicket buyTicket = new BuyTicket();

        Thread t1 = new Thread(buyTicket,"张三");
        Thread t2 = new Thread(buyTicket,"李四");
        Thread t3 = new Thread(buyTicket,"王五");

        t1.start();
        t2.start();
        t3.start();

    }

}
class BuyTicket implements Runnable{


//    票数量
    private int ticketNums = 10;
    boolean flag = true;

//    买票
    @Override
    public void run() {
//        买票
        while (flag){
            Buy();
        }
    }

//    买票
    private void Buy(){
//  判断是否有票
        if(ticketNums<=0){
            flag = false;
            return;
        }

//        模拟延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        买票
        System.out.println(Thread.currentThread().getName()+"买了"+ticketNums--);

    }
}
