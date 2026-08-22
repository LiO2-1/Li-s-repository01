package com.qiyuesan.testdemo;

public class Demo07_3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200 ; i++) {
            if(find(i)){
                System.out.println(i);
                count++;
            }

        }
    }
    public static boolean find(int i) {
        for (int j = 2; j <= (i/2); j++) {
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
