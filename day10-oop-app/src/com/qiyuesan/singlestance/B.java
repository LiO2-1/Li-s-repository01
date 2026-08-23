package com.qiyuesan.singlestance;

public class B {
    //私有化构造器
    private B(){
    }
    public static B b;

    public static B getB(){
        if(b == null){
            b = new B();
        }
        return b;
    }

}
