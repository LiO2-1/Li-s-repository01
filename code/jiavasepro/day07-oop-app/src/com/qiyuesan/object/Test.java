package com.qiyuesan.object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小红";
        s1.chinese = 100;
        s1.math = 100;
        s1.sumScore();
        s1.averageScore();
        System.out.println("------------------");
        Student s2 = new Student();
        s2.name = "小明";
        s2.chinese = 59;
        s2.math = 100;
        s2.sumScore();
        s2.averageScore();
    }
}
