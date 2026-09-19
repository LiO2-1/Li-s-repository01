package com.qiyuesan.operator;

public class OperatorDemo02 {
    public static void main(String[] args) {
        //掌握自增自减的运算符的使用----只能对自变量
        int a =10;
        a++; //a=a+1==++a
        System.out.println(a);  //11
        a--; //a=a-1==--a
        System.out.println(a);  //10

        //当同时也有其他操作时，放前面（++a)先加后算，放后面（a++)先算后加。

        //拓展
        int m =5;
        int n =6;
        int result = ++m - --m + m-- - ++n +n-- + 3;
        System.out.println(result);  //-----9

    }
}
