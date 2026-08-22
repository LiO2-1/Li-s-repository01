package com.qiyuesan.object;

public class Student {
    //成员变量(对象的属性）
    String name;
    double chinese;
    double math;

    //成员方法（对象的方法）
    public void sumScore(){
        System.out.println(name+"的总成绩为："+(chinese+math));
    }

    public void averageScore(){
        System.out.println(name+"的平均成绩为："+(chinese+math)/2.0);
    }
}
