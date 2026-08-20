package com.qiyuesan.demotest;

public class ReturnDemo04 {
    public static void main(String[] args) {
        //掌握return关键字  除法运算
        double s1 = 3234.45;
        double s2 = 0;
        chu(s1,s2);
    }
    public static void chu(double s1,double s2){
        if(s2 == 0){
            System.out.println("输入的数据有误~~");
            return; //跳出此方法！！！
        }
        double c = s1 / s2;
        System.out.println("除法结果为："+c);

    }
}
