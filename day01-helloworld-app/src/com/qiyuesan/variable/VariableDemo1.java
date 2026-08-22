package com.qiyuesan.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
          //变量
        // 1.整型
        int age =18;
        System.out.println(age);
        // 2.小数
        double score =99.5;
        System.out.println(score);

        //替换变量
        int age2 =19;
        age2=20;
        System.out.println(age2);
        age2=age2+1;   //计算机从右往左执行
        System.out.println(age2);
    }
}
