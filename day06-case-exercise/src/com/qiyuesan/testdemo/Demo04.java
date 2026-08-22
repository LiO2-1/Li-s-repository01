package com.qiyuesan.testdemo;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //加密
        System.out.println("加密后的密码为:"+encode());
    }
    public static String  encode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的密码：");
        int code = sc.nextInt();
        int[] arr = split(code);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]+5)%10;
        }
        reverse(arr);
        String data = "";
        for (int i = 0; i < arr.length; i++) {
            data += arr[i];
        }
        return data;
    }

    public static int[] split(int code) {
        int[] arr = new int[4];
        arr[0] = code / 1000;
        arr[1] = (code / 100) % 10;
        arr[2] = (code / 10) % 10;
        arr[3] = code % 10 ;
        return arr;
    }

    public static int[] reverse(int[] arr){
        //遍历时注意length是否要不要-1！！！！
        for (int i = 0 , j = arr.length-1; i < j ; i++ , j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
