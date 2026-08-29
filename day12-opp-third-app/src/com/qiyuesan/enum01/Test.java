package com.qiyuesan.enum01;

public class Test {
    public static void main(String[] args) {
        check(Sex.BOY);
    }
    public static void check(Sex sex){
        switch (sex){
            case BOY -> System.out.println("玄幻小说，奇幻小说。。。");
            case GIRL -> System.out.println("都市小说，古文小说。。。");
        }

    }
}
