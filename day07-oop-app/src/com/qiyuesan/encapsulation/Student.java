package com.qiyuesan.encapsulation;

public class Student {
    //隐藏成员变量
    private double score;

    public void setScore(double score){
        //接入数据的方法
        if(score >= 0 && score <= 100){
            this.score = score;
        }else {
            System.out.println("您的数据有误~~");
        }
    }

    public double getScore(){
        //输出数据的方法
        return score;
    }

    public void printScore(){
        //打印成绩
        System.out.println(score >= 60 ? "成绩及格" : "成绩不及格");
    }
}
