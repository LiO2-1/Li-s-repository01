package com.qiyuesan.thisdemo;

public class Student {
    double score;
    public void print(){
        System.out.println(this);
    }
    public void pass(double score){
        if(this.score > score){
            System.out.println("恭喜你，考上清华大学了~~");
        }else {
            System.out.println("抱歉，您落榜了~~");
        }
    }
}
