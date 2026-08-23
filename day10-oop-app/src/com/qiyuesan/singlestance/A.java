package com.qiyuesan.singlestance;

public class A {
    //私有化构造器
    private A(){
    }
    //建对象
    public static A a = new A();
    //建一个类方法来返回a
    public static A getA(){
        return a;
    }
}
