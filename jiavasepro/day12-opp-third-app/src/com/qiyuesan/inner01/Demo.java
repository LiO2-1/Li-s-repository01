package com.qiyuesan.inner01;

public class Demo {
    public static void main(String[] args) {
        A s1 = new A(){
            @Override
            public void cry() {
                System.out.println("我一直在哭~~");
            }
        };
        s1.cry();
        print(s1);
    }
    public static void print(A s){
        System.out.println("我不会再等了");
    }
}

interface A{
    void cry();
}
