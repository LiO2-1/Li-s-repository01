package com.qiyuesan.operator;

public class OperatorDemo01 {
    public static void main(String[] args) {
        //掌握基本的算术运算符的使用   + - * / %
        int a =10;
        int b =3;
        System.out.println(a+b);  //a+b=13
        System.out.println(a-b);  //a-b=7
        System.out.println(a*b);  //a*b=30
        System.out.println(a/b);  //a/b=3
        System.out.println(a%b);  //a%b=1
        //如果需要除后得到小数，1.可以在被除数后加小数点。2.可以在表达式前加（1.0*）。
        System.out.println(1.0*a/b); // a/b=3.3333333333335

        System.out.println("------------------------------------------------------");

        // "+"可以用来作为连接符使用
        int a2 =2;
        System.out.println(a2+'a'); //99
        System.out.println("sannnyueqi"+a2);  //sanyueqi2
    }
}
