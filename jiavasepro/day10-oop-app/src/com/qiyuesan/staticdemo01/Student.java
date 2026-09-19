package com.qiyuesan.staticdemo01;

public class Student {
    //类变量
    public static String name;

    //实例变量
    int age;

    //作用：一份数据，需要共享
    public static int number;

    public Student(){
        //当前类中不用添加前缀
        number++;
    }
}
