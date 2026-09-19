package com.qiyuesan.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";
        Pint(xj);
        Pint(xp);

    }

    public static void Pint(String s2) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String start = "2023年11月11日 0:0:0";
        long l1 = s1.parse(s2).getTime();
        long l2 = s1.parse(start).getTime();
        if(l1 - l2 <= 600000){
            System.out.println("恭喜你，抢单成功！！");
        }else {
            System.out.println("下次努力吧");
        }
    }
}
