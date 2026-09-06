package com.qiyuesan.stringbuilder01;

import java.util.StringJoiner;

public class Demo03 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(",","[","]");
        s1.add("java1");
        s1.add("java1");
        s1.add("java1");
        s1.add("java1");
        System.out.println(s1);
        System.out.println(s1.length());
        String s3 = s1.toString();
        System.out.println(s3);
    }
}
