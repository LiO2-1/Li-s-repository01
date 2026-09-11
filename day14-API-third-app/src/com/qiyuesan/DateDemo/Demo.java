package com.qiyuesan.DateDemo;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long time = d1.getTime();
        time += 2 *1000;
        System.out.println(time);
        Date d2 = new Date(time);
        System.out.println(d2);

        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
