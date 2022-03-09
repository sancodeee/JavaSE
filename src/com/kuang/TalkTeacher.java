package com.kuang;

//老师

public class TalkTeacher {

    public static void main(String[] args) {

        new Thread(new TalkSend(8888,"localhost",2222)).start();//发送线程
        new Thread(new TalkReceive(3333,"学生")).start();//监听（接收）线程

    }

}
