package com.qiyuesan.define;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //掌握数组的定义方式,静态
        // 1.完整模试： 数据类型【】 数组名 = new 数组类型【】{元素1，元素2，.......}
        int[] ages = new int[]{12,32,43};
        double[] scores = new double[]{99.5,100.0,89,0};

        // 2.简化模式： 数据类型【】 数组名 ={元素1，元素2，.......}
        int[] ages2 ={12,32,43};
        double[] scores2 ={99.5,100.0,89,0};
    }
}
