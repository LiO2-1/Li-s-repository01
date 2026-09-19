package com.qiyuesan.testdemo;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        //验证码
        System.out.println(createCode(5));
    }
    public static String createCode(int i){
        Random r = new Random();
        String code = "";
        for (int j = 1; j <= i; j++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    //数字 0~9
                    code += r.nextInt(10);
                    break;
                case 1:
                    //大写字母   A 65 Z 65+25
                    char c1 = (char) (r.nextInt(26)+65);
                    code += c1;
                    break;
                case 2:
                    //小写字母   a 97 z 97+25
                    char c2 = (char) (r.nextInt(26)+97);
                    code += c2;
                    break;
            }
        }
        return code;
    }
}
