package com.itheima_02;


import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(2);
        ts.add(1);
        ts.add(3);

        for (Integer s : ts){
            System.out.println(s);
        }

    }
}
