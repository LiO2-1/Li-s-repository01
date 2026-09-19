package com.qiyuesan.testdemo;

import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        //抽红包
        int[] redpacket ={9,666,188,520,99999,1000000};
        redPacket(redpacket);
    }
    public static void redPacket(int[] arr){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //抽奖次数
        for (int i = 0; i <= arr.length; i++){
            if(i == arr.length){
                System.out.println("活动结束~~~");
            }else{
                System.out.println("请按任意键开始抽红包：");
                sc.next();
                //死循环：直到arr[s] ！= 0
                while (true) {
                    int s = r.nextInt(arr.length);
                    if (arr[s] != 0) {
                        System.out.println("恭喜你，抽中了：" + arr[s]);
                        arr[s] = 0;
                        break;
                    }
                }
            }
        }
    }
}
