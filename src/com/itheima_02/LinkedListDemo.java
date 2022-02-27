package com.itheima_02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<String>();

        l.add("hello");
        l.add("java");
        l.add("world");

//        l.addFirst("javase");
//        l.addLast("javaee");

//        System.out.println(l.getFirst());

        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());

        System.out.println(l);

    }
}
