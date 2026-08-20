package com.qiyuesan.define;

public class MethodDemo01 {
    public static void main(String[] args) {
        //方法
        int rs = sum(10,23);
        System.out.println(rs);

    }
    //
    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }

}
