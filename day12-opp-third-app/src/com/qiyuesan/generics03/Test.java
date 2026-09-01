package com.qiyuesan.generics03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

    }
    //泛型方法
    public static<E> void get(){
    }
    //通配符 ？在使用泛型时可以代表一切类型   ？extends Student（上限）   ? super Student(下限)
    //限定类型范围
    public static void get1(ArrayList<? extends Student> s1){

    }
}
