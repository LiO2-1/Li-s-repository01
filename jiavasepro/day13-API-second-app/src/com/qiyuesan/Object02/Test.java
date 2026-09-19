package com.qiyuesan.Object02;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Users u1 = new Users(001,"小明",new double[]{99.5,98.0});
        System.out.println(u1.getId());
        System.out.println(u1.getName());
        System.out.println(u1.getScores());
        //clone方法重写
    Users u2 = (Users) u1.clone();
        System.out.println(u2.getId());
        System.out.println(u2.getName());
        System.out.println(u2.getScores());
        u2.setScores(new double[]{99,98});
        System.out.println(u2);
        System.out.println(u1.getScores());

    }
}
