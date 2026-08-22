package com.qiyuesan.string;

import java.util.Random;
import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
        //开发验证码
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入数字获得指定位数验证码：");
            int n = sc.nextInt();
            System.out.println("生成的验证码如下：");
            String code = createCode(n);
            System.out.println(code);
            System.out.println("请输入验证码(不区分大小写)：");
            String loginCode = sc.next();
            if(loginCode.equalsIgnoreCase(code)){
                System.out.println("验证成功~~");
                break;
            }else {
                System.out.println("验证失败，请重试~~");
            }
        }
    }
    public static String createCode(int n){
        Random r = new Random();
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            char[] arr =data.toCharArray();
            code += arr[index];
        }
        return code;
    }
}
