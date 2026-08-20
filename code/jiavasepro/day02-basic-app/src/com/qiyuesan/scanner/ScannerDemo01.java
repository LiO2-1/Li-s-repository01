package com.qiyuesan.scanner;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请您输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄是："+ age);

        System.out.println("请您输入您的名字：");
        String name = sc.next();
        System.out.println(name + "欢迎回来~~");



    }
}
