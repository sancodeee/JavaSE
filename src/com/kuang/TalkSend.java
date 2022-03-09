package com.kuang;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable{

    DatagramSocket socket = null;
    BufferedReader reader = null;

    private int fromPort;
    private String toIp;
    private int toPort;
//    构造方法
//    fromPort发送端口，toPort接收方的接收端口，toIp接收方的ip
    public TalkSend(int fromPort, String toIp, int toPort) {

        this.fromPort = fromPort;
        this.toIp = toIp;
        this.toPort = toPort;

        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
//     线程体
    @Override
    public void run() {

        while (true){

            String data = null;
            try {

                data = reader.readLine();
                byte[] datas = data.getBytes();
                DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(this.toIp,this.toPort));//指定主机的套接字地址
                socket.send(packet);
                if (data.equals("bye")){
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        socket.close();

    }


}
