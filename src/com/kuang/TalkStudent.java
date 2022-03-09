package com.kuang;

//学生

public class TalkStudent {
    public static void main(String[] args) {

        new Thread(new TalkSend(7777,"localhost",3333)).start();// 发送线程
        new Thread(new TalkReceive(2222,"老师")).start();//监听（接收）线程

    }
}
