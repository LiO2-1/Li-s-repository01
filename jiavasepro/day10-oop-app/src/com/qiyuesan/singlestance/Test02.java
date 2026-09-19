package com.qiyuesan.singlestance;

public class Test02 {
    public static void main(String[] args) {
        //懒汉单例
       B b1 = B.getB();
       B b2 = B.getB();
        System.out.println(b1);
        System.out.println(b2);

    }
}
