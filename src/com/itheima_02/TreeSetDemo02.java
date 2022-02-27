package com.itheima_02;

import java.util.TreeSet;

public class TreeSetDemo02 {

    public static void main(String[] args) {
//创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();
//创建学生对象
        Student s1 = new Student("zhangsan", 12);
        Student s2 = new Student("lisi", 13);
        Student s3 = new Student("wangwu", 34);
//将学生对象添加到ts集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
//遍历 ts集合
        for (Student student : ts) {

            System.out.println(student);

        }

    }


}
