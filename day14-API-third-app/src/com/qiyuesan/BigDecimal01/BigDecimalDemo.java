package com.qiyuesan.BigDecimal01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //目标：学会BigDecimal来精确化数值运算
        BigDecimal b1 = BigDecimal.valueOf(0.3);
        BigDecimal b2 = BigDecimal.valueOf(0.4);
        BigDecimal b3 = b1.add(b2); //加法
        System.out.println(b3);
        BigDecimal b4 = b1.subtract(b2);  //减法
        System.out.println(b4);
        BigDecimal b5 = b1.multiply(b2);  //乘法
        System.out.println(b5);
        BigDecimal b6 = b1.divide(b2);  //除法
        System.out.println(b6);

        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal a2 = BigDecimal.valueOf(0.3);
        BigDecimal a3 = a1.divide(a2,2, RoundingMode.HALF_UP);
        System.out.println(a3);

    }
}
