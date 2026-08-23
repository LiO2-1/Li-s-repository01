package com.qiyuesan.method_re;

public class B extends A{
    String s1 = "李";
    //方法重写
    @Override
    public void print(){
        System.out.println(999999);
    }
    //方法重写
    @Override
    public void print(int a){
        System.out.println(333333);
    }
    public void print1(){
        System.out.println(s1);
        //super 可以定位到父类的成员变量
        System.out.println(super.s1);
    }

}
