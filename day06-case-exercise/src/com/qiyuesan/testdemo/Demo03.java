package com.qiyuesan.testdemo;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //打分
        System.out.println("最终分数为："+score(4));
    }
    public static double score(int i){
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[i];
        for (int j = 0; j < i; j++) {
            System.out.println("第"+(j+1)+"位评委，请打分：");
            double score = sc.nextDouble();
            arr[j] = score;
        }
        double sum = 0;
        double sr = 0;
        double max = arr[0];
        double min = arr[0];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(arr[i1] > max){
                max = arr[i1];
            }
            if(arr[i1] < min){
                min = arr[i1];
            }
            sum += arr[i1];
        }
        sum -= max+min;
        sr = sum/(i-2);
       return sr;
    }
}
