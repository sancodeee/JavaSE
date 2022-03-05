package com.itheima03;

//不安全取钱
//两个人去银行取钱

public class UnsafetyBank {
    public static void main(String[] args) {

        Account account = new Account("启动资金",1000);
        Drawing zhangsan = new Drawing(account,50,"张三");
        Drawing lisi = new Drawing(account,100,"赵四");

        zhangsan.start();
        lisi.start();

    }

}

//账户
class Account{
    int money;
    String name;
    public Account(String name,int money){
        this.name = name;
        this.money = money;
    }
}

//银行：模拟取款
class Drawing extends Thread{

    Account account;//账户
    int drawingMoney;//取了多少钱
    int nowMoney;//现在有多少钱

    public Drawing (Account account,int drawingMoney,String name){

        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;

    }


    //取钱
    @Override
    public void run() {

     //同步块内，锁账户
        synchronized (account){
            //判断有没有钱
            if(account.money-drawingMoney<0){

                System.out.println(Thread.currentThread().getName()+"钱不够了取不了");
                return;

            }
            //卡内余额 = 余额-取出的钱
            account.money = account.money - drawingMoney ;
            //你手里的钱
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.name+"余额为"+account.money);
            System.out.println(this.getName()+"手里的钱："+nowMoney);

        }
    }
}

