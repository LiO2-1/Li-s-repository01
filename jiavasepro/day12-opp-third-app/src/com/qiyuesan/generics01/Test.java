package com.qiyuesan.generics01;

public class Test {
    public static void main(String[] args) {
        //泛类
        MyArrayList<String> s1 = new MyArrayList();
        s1.add("sn");

        Cat<Animal> s2 = new Cat<>();

    }
}
