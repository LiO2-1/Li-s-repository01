package com.qiyuesan.string;

public class StringDemo01 {
    public static void main(String[] args) {
    // 1.
    String s1 = "liguoxing";

    // 2.
    String s2 = new String("guoxing");

    // 3.
    char[] chars ={'a','s'};
    String s3 = new String(chars);
    System.out.println(s3);

    // 4.
    byte[] bytes = {97,98,99};
    String s4 = new String(bytes);
    System.out.println(s4);



    }
}
