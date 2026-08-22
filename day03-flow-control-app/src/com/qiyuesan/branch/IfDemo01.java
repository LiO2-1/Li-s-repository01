package com.qiyuesan.branch;

public class IfDemo01 {
    public static void main(String[] args) {
        //掌握 if分支三种形式的用法
        // 1. 体温测试
        double tem = 39.5;
        if(tem >38.0){
            System.out.println("您体温不正常~~");
        }

        System.out.println("--------------------------------------------------------");

        // 2. 发红包
        double money = 10000;
        if(money >= 520){
            money = money - 520;
            System.out.println("发送成功,余额为：" + money);
        }else{
            System.out.println("余额不足，支付失败~~");
        }

        System.out.println("--------------------------------------------------------");

        // 3. 公司评优
        // [0,60) D  [60,80) C [80,90) B [90,100) A
        int score = 99;
        if(score >= 0 && score< 60){
            System.out.println("您的评价为D");
        }else if (score >= 60 && score< 80){
            System.out.println("您的评价为C");
        }else if (score >= 80 && score< 90){
            System.out.println("您的评价为B");
        }else if (score >= 90 && score< 100){
            System.out.println("您的评价为A，恭喜~~");
        }else{
            System.out.println("输入错误，请重试~~");
        }
    }
}
