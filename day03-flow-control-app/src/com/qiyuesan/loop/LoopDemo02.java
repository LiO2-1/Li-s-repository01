package com.qiyuesan.loop;

public class LoopDemo02 {
    public static void main(String[] args) {
        //for批量生产数据
        for (int i = 0; i <=20 ; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------------------");

        //求和
        // 1.求和100
        int sum =0;
        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
            System.out.println(sum);

        // 2.求和100内奇数

        // 1.
        int sum2 =0;
        for (int i = 1; i <=100 ; i += 2) {
            sum2 += i;
        }
            System.out.println(sum2);

        // 2.
        int sum3 =0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2 == 1){
                sum3 +=i;
            }
        }
        System.out.println(sum3);

    }
}
