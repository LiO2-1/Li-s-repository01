package com.qiyuesan.testdemo;
/**
       *
      ***
     *****
    *******
 */

public class Demo09 {
    //打印三角形
    public static void main(String[] args) {
        int s = 100;
        for (int i = 1; i <= s; i++) {
            for(int j = 1; j <= (s-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(j % 2 == 0 ? " ": "*");
            }
            System.out.println();
        }
    }
}
