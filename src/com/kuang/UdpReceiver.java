package com.kuang;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//聊天接收方
public class UdpReceiver {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(6666);

        while (true){

            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            socket.receive(packet);//阻塞式接收

            //断开连接
            byte[] data = packet.getData();
            String receiveData = new String(data,0,packet.getLength());
            System.out.println(receiveData);

            if (receiveData.equals("bye")){
                break;
            }

        }
        socket.close();

    }

}
