package com.qiyuesan.loop;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的余额：");
        double money = sc.nextDouble();
        System.out.println("您的余额为：" + money);

        int i =0;

        while(i < 1) {

            System.out.println("您是否要发红包？");
            String str = sc.next();
            switch (str) {
                case "是":
                    System.out.println("欢迎~~");

                    System.out.println("请输入您红包的金额：");
                    double money2 = sc.nextDouble();
                    if (money >= money2) {
                        money -= money2;
                        System.out.println("发送成功，您的余额为：" + money);
                        i++;
                    } else {
                        System.out.println("余额不足，请重试~~");
                    }
                    break;
                case "否":
                    System.out.println("再见~~");
                    return;
                default:
                    System.out.println("输入错误，请重试~~");
            }
        }




    }
}
