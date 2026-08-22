package com.qiyuesan.string;

import java.util.Scanner;

public class StringTest01 {
    //模拟登录
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 3) {
            System.out.println("请输入您的账号：");
            String loginName = sc.next();
            System.out.println("请输入您的密码：");
            String passWard = sc.next();
            if (login(loginName,passWard)) {
                System.out.println("登录成功~~");
                break;
            }else {
                System.out.println(i < 3 ? "账号或密码有误，请重试~~" : "");
                i++;
            }
        }
        System.out.println("冷却中~~");
    }

    public static boolean login(String loginName,String passWord){
        String okName = "sanyueqi";
        String okPassword = "Lgx20080116";
        if (loginName.equals(okName) && passWord.equals(okPassword)){
            return true;
        }
        return false;
    }
}
