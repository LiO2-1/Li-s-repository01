package com.qiyuesan.define;

import java.util.Scanner;

public class ArrayTest06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[4];
        double sum = 0;
        for (int i = 0; i < scores.length ; i++) {
            System.out.println("第"+(i+1)+"位评委请打分：");
            double score0 = sc.nextDouble();
            scores[i] = score0;
            sum += scores[i];
        }

        System.out.println("选手的最终得分为："+sum/ scores.length);





    }
}
