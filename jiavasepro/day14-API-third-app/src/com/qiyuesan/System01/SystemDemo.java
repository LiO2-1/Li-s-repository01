package com.qiyuesan.System01;

public class SystemDemo {
    public static void main(String[] args) {
        //终止虚拟机
//        System.exit();

        //获取当前时间
        long l1 = System.currentTimeMillis();
        System.out.println(l1/1000/60/60/24/365);

        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出了"+i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1)/1000.0+"s");
    }
}
