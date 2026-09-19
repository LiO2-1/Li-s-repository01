package com.qiyuesan.CalendarDemo;

import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        //获取信息
        int i = now.get(Calendar.YEAR);
        System.out.println(i);

        //日期对象
        Date D1  = now.getTime();
        System.out.println(D1);

        //取时间毫秒值
        long s1 = now.getTimeInMillis();
        System.out.println(s1);

        //修改内容
        now.set(Calendar.YEAR,2027);
        now.set(Calendar.DAY_OF_YEAR,100);
        System.out.println(now);

        //增添内容
        now.add(Calendar.YEAR,100);
        System.out.println(now);

    }
}
