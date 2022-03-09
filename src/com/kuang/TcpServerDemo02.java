package com.kuang;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {

    public static void main(String[] args) throws IOException {

//      1、创建服务
        ServerSocket serverSocket = new ServerSocket(9999);
//       2、监听客户端连接
        Socket socket = serverSocket.accept();
//       3、获取输入流
        InputStream is = socket.getInputStream();
//        4、创建一个文件输出流，用来将输入流管道中的文件输出到本地
        FileOutputStream fos = new FileOutputStream(new File("receive.jpg"));
//        5、创建缓存用来保存输入流中的文件
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer))!=-1){

//           6、文件输出流将缓存中的数据写出到本地
            fos.write(buffer,0,length);

        }

//        关闭资源
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();


    }
}
