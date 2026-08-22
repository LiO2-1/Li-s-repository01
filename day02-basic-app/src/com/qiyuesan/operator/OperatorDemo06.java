package com.qiyuesan.operator;

public class OperatorDemo06 {
    public static void main(String[] args) {
        // 掌握三元运算符
        double score =98.5;
        String rs = score >= 60 ? "成绩合格" : "成绩不合格";
        System.out.println(rs);

        //例
        // 1. 找出两个数中的较大值,并输出。
        int a =99;
        int b =67;
        int rs1 = a >= b ? a : b;
        System.out.println(rs1);

        // 2. 找出三个数中的较大值,并输出。
        int z =19;
        int x =112;
        int c =110;
        int rs2 = z > x ? z : x;
        int rs3 = c > rs2 ? c : rs2;
        System.out.println(rs3);
    }
}
