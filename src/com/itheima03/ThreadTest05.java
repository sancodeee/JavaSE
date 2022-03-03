package com.itheima03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

public class ThreadTest05 implements Callable<Boolean> {
    private String url;   //网络图片地址
    private String name;   //保存文件名

    public ThreadTest05(String url, String name) {
        this.name = name;
        this.url = url;
    }  //带参构造方法

    @Override
    public Boolean call() throws Exception {

        webDonloader wD = new webDonloader();
        wD.downloader(url,name);
        System.out.println("下载了文件" + name);

        return true;

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

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//       创建三个线程
        ThreadTest05 t1 = new ThreadTest05("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201701%2F28%2F20170128215011_2Fh8T.png&refer=http%3A%2F%2Fb-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1648692836&t=990d238f51723a8fc30796aa2c09b857", "1.jpg");
        ThreadTest05 t2 = new ThreadTest05("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi2.hdslb.com%2Fbfs%2Farchive%2F9ee06b6735d4058cf9ede0ce8d0308d31a2d3e21.jpg&refer=http%3A%2F%2Fi2.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1648692f1e258acf8541ddc146e4960837567a8836&t=", "2.jpg");
        ThreadTest05 t3 = new ThreadTest05("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi2.hdslb.com%2Fbfs%2Farchive%2F9ee06b6735d4058cf9ede0ce8d0308d31a2d3e21.jpg&refer=http%3A%2F%2Fi2.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1648692f1e258acf8541ddc146e4960837567a8836&t=", "3.jpg");

//        创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

//        提交执行结果
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

//        获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);


//        关闭服务
        ser.shutdownNow();

    }
}


