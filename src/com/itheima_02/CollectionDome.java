package com.itheima_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDome {
    public static void main(String[] args) {

        //创建Collection对象
        Collection<Student> s = new ArrayList<Student>();

//        创建学生对象
        Student s1 = new Student("林青霞", 19);
        Student s2 = new Student("谭咏麟", 80);
        Student s3 = new Student("小明", 21);
//        将学生对象添加到集合中去
        s.add(s1);
        s.add(s2);
        s.add(s3);
//        遍历集合（迭代器方式）
        Iterator<Student> it = s.iterator();

        while (it.hasNext()) {

            Student student = it.next();
            System.out.println(student.getName() + "," + student.getAge());

        }


    }
}
