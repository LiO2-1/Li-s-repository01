package com.qiyuesan.inner;

public class Outer {
    private int v ;
    //内部类
    public class inter{
        int score;
        public void one(){
            System.out.println("孟尝君上课哦");
            System.out.println(v);
        }
    }
}
