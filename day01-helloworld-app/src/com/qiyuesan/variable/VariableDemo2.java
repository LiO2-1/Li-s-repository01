package com.qiyuesan.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //1.变量需要声明
        int age =18;
        System.out.println(age);

        //2.数据需要和变量类型一致

        //3.变量只在定义-”}“范围内有效，同一个范围内变量不能重名。
        {
            int a =10;
            System.out.println(a);
        }
        int a =19;

        //4.变量定义的时候可以不赋值，但使用的时候必须需要有值。
    }
}
