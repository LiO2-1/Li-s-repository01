package com.qiyuesan.type;

public class TypeDemo02 {
    public static void main(String[] args) {
        // 掌握表达式的自动类型转换机制
        byte a =10;
        int b =12;
        long c =13;
        long d =a+b+c;  //类型为long
        System.out.println(d);

        double e =a+b+0.1;  //类型为double
        System.out.println(e);

        byte f =10;
        short g =12;
        int h =f+g;  //类型为int
        //表达式中 byte short char 直接转换为int类型。


    }
}
