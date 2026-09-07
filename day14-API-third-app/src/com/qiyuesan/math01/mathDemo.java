package com.qiyuesan.math01;

public class mathDemo {
    public static void main(String[] args) {
        // 目标：了解下Math类提供的常见方法。
// 1、public static int abs(int a)：取绝对值（拿到的结果一定是正数）
//    public static double abs(double a)
        int a = -1;
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(-9.2));

// 2、public static double ceil(double a)：向上取整
        System.out.println(Math.ceil(9.3));   //----10.0

// 3、public static double floor(double a)：向下取整
        System.out.println(Math.floor(9.3));   //----9.0

// 4、public static long round(double a)：四舍五入
        System.out.println(Math.round(12.3));

// 5、public static int max(int a, int b)：取较大值
        System.out.println(Math.max(12, 34));

//    public static int min(int a, int b)：取较小值
        System.out.println(Math.min(12, 45));

// 6、public static double pow(double a, double b)：取次方
        System.out.println(Math.pow(2.0, 3.0));

// 7、public static double random()：取随机数[0.0 , 1.0)（包前不包后）
        System.out.println(Math.random()); //固定范围
    }
}
