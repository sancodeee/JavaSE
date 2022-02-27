package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 创建Collection集合对象的方式
 *       多态的方式
 *       ArrayList()
 * */

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素:boolean add (E e)
        c.add("Hello");
        c.add("world");
        c.add("java");

        //输出集合对象
        System.out.println(c);//如果结果是该类的位置信息说明没有重写toString方法，其结果是对象中的元素，说明重写了toString()方法
    }


}
