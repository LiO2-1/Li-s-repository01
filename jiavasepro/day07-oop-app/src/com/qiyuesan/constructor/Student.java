package com.qiyuesan.constructor;

public class Student {
    String name;
    double score;
    public Student(){
        //无参数构造器
    }

    public Student(String name,double score){
        //有参数构造器
        this.name = name;
        this.score = score;
    }
}
