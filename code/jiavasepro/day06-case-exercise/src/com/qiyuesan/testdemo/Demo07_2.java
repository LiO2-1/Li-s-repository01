package com.qiyuesan.testdemo;

public class Demo07_2 {
    public static void main(String[] args) {
        find2(101,200);
    }
    public static void find2(int start,int end) {
        int count = 0;
        OUT:
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    continue OUT;
                }
            }
            count++;
            System.out.println(i);

        }
        System.out.println("个数为："+count);
    }
}
