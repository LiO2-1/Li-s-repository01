package com.qiyuesan.testdemo;

public class Demo07 {
    public static void main(String[] args) {
        //找素数
        System.out.println("当前素数个数为："+find1(101, 200));
    }

    public static int find1(int start,int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            //标记位
            boolean flag = true;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
