package com.qiyuesan.demo;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //随机排名
        int[] arr = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("第"+(i+1)+"位员工，请输入您的工号：");
            int gonghao = sc.nextInt();
            arr[i] = gonghao;
        }
        Random r = new Random();
        for (int i = 0; i <arr.length+100 ; i++) {
            int j = r.nextInt(arr.length);
            int x = r.nextInt(arr.length);
            int temp = arr[x];
            arr[x] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
