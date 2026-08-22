package com.qiyuesan.define;

import java.util.Scanner;

public class MethodTest01 {
    public static void main(String[] args) {
        //自动计算1-n的和
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入您要计算的末数：");
            int n = sc.nextInt();
            int sr = sum(n);
            System.out.println("1-" + n + "的和为：" + sr);
        }

    }
    public static int sum(int n){
        int x = 0;
        for (int i = 0; i<=n ; i++) {
            x += i;
        }
        return x;
    }
}
