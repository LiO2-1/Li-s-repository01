package com.qiyuesan.define;

import java.util.Scanner;

public class MethodTest02 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要判断的数是否是偶数：");
            int n = sc.nextInt();
            System.out.println(judge(n));
        }

    }
    public static boolean judge(int n){
        boolean b = (n % 2 == 0);
        return b;
    }
}
