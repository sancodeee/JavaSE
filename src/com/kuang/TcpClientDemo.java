package com.kuang;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class TcpClientDemo {

    public static void main(String[] args) {
            Socket socket = null;
            OutputStream os = null;


        try {

//            1、要知道服务器的ip地址、端口号
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 9999;
//            2、创建一个socket连接
            socket = new Socket(ip,port);
//            3、发送消息io流
            os = socket.getOutputStream();//返回输出流
            //getBytes()方法：将此String编码为字符序列，将结果存储到新的字节数组中
            os.write("你好，李焕英!".getBytes());
            os.write("在吗？".getBytes());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
