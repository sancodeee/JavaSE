package com.kuang;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {

    public static void main(String[] args) throws IOException {

//        1、创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
//        2、创建一个输出流
        OutputStream os = socket.getOutputStream();
//        3、读取文件：将文件输入到管道（以管道为中心，进管道就是输入流，出管道就是输出流）
        FileInputStream fis = new FileInputStream(new File("F:\\壁纸\\1.jpg"));
//        4、写出文件
        byte[] buffer = new byte[1024];     //缓存数组，用来缓存要上传的文件
        int length;
        while ((length=fis.read(buffer))!=-1){     //文件输入流将本地文件写入到缓存中
//            如果缓存中有文件，就输出流就持续写出
            os.write(buffer,0,length);
        }

//            关闭资源
        fis.close();
        os.close();
        socket.close();

    }
}
