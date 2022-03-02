package com.itheima_01;

public class IntegerDemo {
    public static void main(String[] args) {

        try {
            Integer integer = Integer.valueOf('a');
            int i = integer;
            System.out.println(i);

        }catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("触发异常");
        }

    }
}
