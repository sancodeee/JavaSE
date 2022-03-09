package com.itheima03;

//实现多线程下载器

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class threadTest02 extends Thread {

    private String url;   //网络图片地址
    private String name;   //保存文件名

    public threadTest02(String url, String name) {
        this.name = name;
        this.url = url;
    }  //带参构造方法

    //    线程执行体
    @Override
    public void run() {
        webDonloader wD = new webDonloader();
        wD.downloader(url, name);
        System.out.println("下载了文件"+name);
    }

    //    下载器
    class webDonloader {
        public void downloader(String url, String name) {
            try {
                FileUtils.copyURLToFile(new URL(url), new File(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("io异常，downloader方法出现异常");
            }
        }
    }

    public static void main(String[] args) {

//        创建线程对象
        threadTest02 t1 = new threadTest02("https://m801.music.126.net/20220309174414/a58bdae09c950a7528e67fcb39a6b550/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/7150237012/288e/e749/081f/8ca6430d593518eaddc65be19bf56513.m4a", "13.m4a");
        threadTest02 t2 = new threadTest02("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi2.hdslb.com%2Fbfs%2Farchive%2F9ee06b6735d4058cf9ede0ce8d0308d31a2d3e21.jpg&refer=http%3A%2F%2Fi2.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1648692f1e258acf8541ddc146e4960837567a8836&t=", "2.jpg");
        threadTest02 t3 = new threadTest02("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202001%2F06%2F20200106165415_ehhmm.jpg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1648692836&t=de893c505b03403d36cc2fcb01ab1910", "3.jpg");

        t1.start();  //运行线程
        t2.start();
        t3.start();
    }


}
