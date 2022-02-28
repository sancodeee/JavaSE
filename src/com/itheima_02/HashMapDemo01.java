package com.itheima_02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("元素01", "zhangsan");
        hashMap.put("元素02", "lisi");
        hashMap.put("元素03", "wangwu");

        hashMap.put("元素03", "niuma");

//        System.out.println(hashMap);

//        根据键key获取值的方法 V get()；
//        System.out.println(hashMap.get("元素01"));
//        System.out.println(hashMap.get("元素02"));

//        获取所有集合的键key
//        Set<String> keySet = hashMap.keySet();
//        for(String keySets : keySet){
//            System.out.println(keySets);
//        }

//        遍历集合
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet){
            String value = hashMap.get(key);
            System.out.println(key+","+value);
        }

    }
}
