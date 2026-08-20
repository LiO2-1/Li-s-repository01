package com.qiyuesan.javabean;

public class Student {
    //实体类 成员变量必须私有，且有get，set方法：必须有无参数构造器
    private String name;
    private double score;

    public Student(String name, double score) {
        //有参
        this.name = name;
        this.score = score;
    }

    public Student(){
        //无参
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
