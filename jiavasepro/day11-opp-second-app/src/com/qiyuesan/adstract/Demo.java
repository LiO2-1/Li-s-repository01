package com.qiyuesan.adstract;

public class Demo {
    //抽象方法
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.write();

        System.out.println("-------------");

        Student s1 = new Student();
        s1.write();
    }
}
