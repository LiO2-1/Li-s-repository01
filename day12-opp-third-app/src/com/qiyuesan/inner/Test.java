package com.qiyuesan.inner;

public class Test {
    public static void main(String[] args) {
        Outer.inter in = new Outer().new inter();
        in.one();
    }
}
