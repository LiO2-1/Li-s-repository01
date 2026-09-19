package com.qiyuesan.loop;

public class WhileTest01 {
    public static void main(String[] args) {
        //案例：珠穆朗玛峰和折纸
        double height =8848860.0;
        double thickness =0.1;
        int i =0;
        while (thickness < height){
            thickness = thickness*2;
            i++;
        }
        System.out.println("需要折的次数为"+i);
        System.out.println("厚度为"+thickness);

    }
}
