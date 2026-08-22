package com.qiyuesan.branch;

public class SwitchDemo03 {
    public static void main(String[] args) {
        //了解switch穿透性可以简化代码

        String week = "周三";
        switch (week){
            case"周一":
                System.out.println("埋头苦干，解决Bug.");
                break;
            case"周二":
            case"周三":
            case"周四":
                System.out.println("请求大牛程序员帮忙.");
                break;
            case"周五":
                System.out.println("今晚吃鸡.");
                break;
            case"周六":
            case"周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("您输入错误，请重试~~");
            }

        }
}
