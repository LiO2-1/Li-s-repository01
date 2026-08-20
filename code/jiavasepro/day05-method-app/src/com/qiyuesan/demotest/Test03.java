package com.qiyuesan.demotest;

public class Test03 {
    public static void main(String[] args) {
        //掌握方法重载
        fire();
        fire("赤壁");
        fire("东吴",99);
    }
    public static void fire(){
        System.out.println("默认随机发射一枚导弹！！！");
    }
    public static void fire(String country){
        System.out.println("向"+country+"发射一枚导弹~~");
    }
    public static void fire(String country,int i){
        System.out.println("向"+country+"发射"+i+"枚导弹~~");
    }
}
