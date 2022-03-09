package com.kuang;

import java.io.IOException;
import java.net.*;

public class UdpClientDemo {
    public static void main(String[] args) throws IOException {

//        建立一个socket
        DatagramSocket socket = new DatagramSocket();
//        建立一个包
        String msg = "你好啊，服务器";
        InetAddress localhost = InetAddress.getByName("127.0.0.1");
        int port = 9999;
//        数据包
        DatagramPacket packet = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);

//        发送包
        socket.send(packet);
//        关闭连接
        socket.close();



    }
}
