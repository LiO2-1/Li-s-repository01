package com.qiyuesan.SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(time);
        System.out.println(s);  //String
        System.out.println(sdf.format(time));  //String
        System.out.println("---------------------------");

         Date d3 = sdf.parse(s);
        System.out.println(d3);
    }
}
