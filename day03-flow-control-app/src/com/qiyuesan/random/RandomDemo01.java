package com.qiyuesan.random;

import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        //掌握随机数
        Random r = new Random();
        for (int i = 1;i < 7; i++) {
            int data = r.nextInt(10);// 0~9
            System.out.println(data);
        }

        System.out.println("----------------------------");

        //生成 1~10的随机数
        for (int i = 1;i < 7; i++) {
            int data2 = r.nextInt(10)+1;
            System.out.println(data2);
        }

    }
}
