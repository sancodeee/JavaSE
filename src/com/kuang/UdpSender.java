package com.kuang;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

//聊天发送方
public class UdpSender {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(8888);  //本机的端口号
        //        准备数据，控制台读取数据 System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//从字符输入流读取文本

        while (true){

            String data = reader.readLine();
            byte[] datas = data.getBytes();

            DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));//指定主机的套接字地址
            socket.send(packet);

            if (data.equals("bye")){
                break;
            }
        }

        socket.close();

    }
}
