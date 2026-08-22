package com.qiyuesan.define;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] money = {16,26,36,6,100};
        int s = 0;
        for (int i = 0; i < money.length; i++) {
            s += money[i];
        }
        System.out.println(s);


    }
}
