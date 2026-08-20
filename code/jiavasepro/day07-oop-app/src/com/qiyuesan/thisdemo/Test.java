package com.qiyuesan.thisdemo;

public class Test {
    public static void main(String[] args) {
        //认识this,可用来指向当前对象
        Student s1 = new Student();
        System.out.println(s1); //com.qiyuesan.thisdemo.Student@4c873330
        s1.print();             //com.qiyuesan.thisdemo.Student@4c873330
        //作用：处理对象的成员对象和方法内部变量重复的问题
        Student s2 = new Student();
        s2.score = 703;
        s2.pass(702);
    }
}
