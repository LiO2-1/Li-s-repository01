package com.qiyuesan.javabean;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("小明");
        s.setScore(100);
        System.out.println(s.getName());
        System.out.println(s.getScore());

        Student s1 = new Student("小红",99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        System.out.println("-------------------");

        StudentOperate operate = new StudentOperate(s1);
        operate.scorePass();

    }
}
