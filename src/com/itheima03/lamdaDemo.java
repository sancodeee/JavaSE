package com.itheima03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//1、定义一个只有一个抽象方法的接口
interface ILike {
    abstract void lamda();
}

//2、实现类
class Like implements ILike{
    @Override
    public void lamda() {

        System.out.println("i like lamda1");

    }
}


public class lamdaDemo {

    //3、静态内部类
    static class Like2 implements ILike{
        @Override
        public void lamda() {

            System.out.println("i like lamda2");

        }
    }


    public static void main(String[] args) {
        ILike like = new Like();
        like.lamda();       //外部实现类对象调用方法

        Like2 like2 = new Like2();
        like2.lamda();       //静态内部类对象调用方法


//    4、局部（方法）内部类
        class Like3 implements ILike{
            @Override
            public void lamda() {

                System.out.println("i like lamda3");
            }
        }
        like = new Like3();
        like.lamda();


//       5、 匿名内部类
        like = new ILike() {
            @Override
            public void lamda() {
                System.out.println("i like lamda4");
            }
        };
        like.lamda();


//        6、lamda表达式
        like = ()->{
            System.out.println("i like lamda5");
        };//相当于直接创建 实现接口的类 的对象，其中大括号里时重写的抽象方法
        like.lamda();


    }


}
