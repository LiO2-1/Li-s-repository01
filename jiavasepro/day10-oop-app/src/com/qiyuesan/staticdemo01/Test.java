package com.qiyuesan.staticdemo01;

public class Test {
    public static void main(String[] args) {
        Student.name = "李国兴";

        Student s1 = new Student();
        s1.name = "liguoxing";
        s1.age = 10;

        //记住有多少个对象
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        System.out.println(Student.number);
    }
}
