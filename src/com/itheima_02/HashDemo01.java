package com.itheima_02;

import java.util.HashSet;

public class HashDemo01 {
    public static void main(String[] args) {

        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 20);
        Student s3 = new Student("王五", 20);

        Student s4 = new Student("王五", 20);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
