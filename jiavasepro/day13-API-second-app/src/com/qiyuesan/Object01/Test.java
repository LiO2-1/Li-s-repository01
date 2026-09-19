package com.qiyuesan.Object01;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("小明");
        s1.setScore(100);
        System.out.println(s1);

        Student s2 = new Student("小明",100);
        Student s3 = new Student("小明",98);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
