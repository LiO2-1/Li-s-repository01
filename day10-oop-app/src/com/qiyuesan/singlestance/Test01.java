package com.qiyuesan.singlestance;

public class Test01 {
    public static void main(String[] args) {
        //饿汉单例
        A a1 = A.getA();
        A a2 = A.getA();
        System.out.println(a1);
        System.out.println(a2);
    }

}
