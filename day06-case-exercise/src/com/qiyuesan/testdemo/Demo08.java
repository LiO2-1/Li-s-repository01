package com.qiyuesan.testdemo;

public class Demo08 {
    public static void main(String[] args) {
        //打印9*9乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if(i >= j){
                System.out.print(i + "*"+ j + "=" + (i*j)+"   ");
                }
            }
            System.out.println();
        }
    }
}
