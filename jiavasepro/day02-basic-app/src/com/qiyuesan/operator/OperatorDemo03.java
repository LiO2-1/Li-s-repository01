package com.qiyuesan.operator;

public class OperatorDemo03 {
    public static void main(String[] args) {
        //掌握扩展赋值运算符
        int a =10;
        int b =3;
        //    +=
        a+=b;   //  a+=b   a=a+b
        System.out.println(a);  //13

        //    -=
        a-=b;   //  a-=b   a=a-b
        System.out.println(a);  //10

        //    *=
        a*=b;   //  a=a*b
        System.out.println(a);  //30

        //    /=
        a/=b;   //  a=a/b
        System.out.println(a);  //10

        //    %=
        a%=b;   //  a=a%b
        System.out.println(a);   //1


    }
}
