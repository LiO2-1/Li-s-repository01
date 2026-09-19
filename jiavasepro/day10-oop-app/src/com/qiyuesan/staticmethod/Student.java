package com.qiyuesan.staticmethod;

public class Student {
    //私有化，外界无法建立Student对象
    private Student(){

    }
    //类方法
    public static void print(){
        System.out.println("helloworld");
    }

    //实例方法
    public void print1(){
        System.out.println("HelloWorld");
    }
}
