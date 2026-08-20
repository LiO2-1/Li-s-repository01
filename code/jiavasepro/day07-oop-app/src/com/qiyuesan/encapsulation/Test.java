package com.qiyuesan.encapsulation;

public class Test {
    public static void main(String[] args) {
        //了解和运用封装
        Student s = new Student();
        s.setScore(99);
        System.out.println(s.getScore());
        s.printScore();
    }
}
