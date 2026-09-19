package com.qiyuesan.baozuanglei;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class IntegerDemo {
    public static void main(String[] args) {
        //构建数据类型变量
        Integer i1 = Integer.valueOf(12);
        System.out.println(i1);

        Integer i2 = 12;

        //泛型和集合不支持基础数据类型，只能支持引用数据类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        int s1 = list.get(0);
        System.out.println(s1);

        //转换为字符串
        Integer A = 12;
        String S1 = Integer.toString(A);
        //转化为字符串
        System.out.println(S1 + 1);

        String s2 = A.toString();
        System.out.println(s2 + 1);

        String s3 = A + "" ;
        System.out.println(s3 + 1);

        //转换为数
        String s4 = "12";
        int z1 = Integer.parseInt(s4);

        String s5 = "23.4";
        double z2 = Double.parseDouble(s5);

        //通用
        int a1 = Integer.valueOf(A);
        System.out.println(a1);

    }
}
