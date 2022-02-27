package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator<String> it = c.iterator(); //返回此集合中的迭代器，通过集合中的iterator()方法得到

//        System.out.println(it.next()); //输出集合中的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
        while (it.hasNext()){     //判断集合是否有元素
            String s = it.next();
            System.out.println(s);
        }
    }
}
