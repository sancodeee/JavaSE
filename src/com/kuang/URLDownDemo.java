package com.kuang;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLDownDemo {

    public static void main(String[] args) throws IOException {
//      下载地址
        URL url = new URL("https://m801.music.126.net/20220309174414/a58bdae09c950a7528e67fcb39a6b550/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/7150237012/288e/e749/081f/8ca6430d593518eaddc65be19bf56513.m4a");
//      连接到这个资源
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
//      创建输入流用来输入到本地
        InputStream inputStream = urlConnection.getInputStream();
//        文件输出流将文件输出到本地
        FileOutputStream fos = new FileOutputStream("13.m4a");

        byte[] buffer = new byte[1024];
        int leng;
        while ((leng = inputStream.read(buffer))!=-1){ //注意  read方法：从输入流读取一些字节数并将它们存储到buffer里

            fos.write(buffer,0,leng);//写出这个数据

        }
        
        fos.close();
        inputStream.close();
        urlConnection.disconnect();

    }

}
