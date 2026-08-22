package com.qiyuesan.define;

public class MethodDemo02 {
    public static void main(String[] args) {
        print();      // 1.

        System.out.println("-------------------");

        print1(6); // 2.
    }
    //无/有参数，无返回值的方法

    // 1.无
    public static void print(){
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello World");
        }
    }

    // 2.有
    public static void print1(int i){
        for (int j = 1; j <= i; j++) {
            System.out.println("I love you!!!");
        }
    }
}
