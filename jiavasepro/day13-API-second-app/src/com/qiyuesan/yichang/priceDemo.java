package com.qiyuesan.yichang;

import java.util.Scanner;

public class priceDemo {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(price1());
                break;
            } catch (Exception e) {
                System.out.println("他妈的别乱打");
            }
        }
    }
    public static double price1(){
        while (true) {
            System.out.println("请输入价格：");
            Scanner sc = new Scanner(System.in);
            double sc1 = sc.nextDouble();
            if (sc1 >= 0){
                System.out.println("设定成功！！");
                return sc1;
            }else {
                System.out.println("不能小于0");
            }
        }
    }
}
