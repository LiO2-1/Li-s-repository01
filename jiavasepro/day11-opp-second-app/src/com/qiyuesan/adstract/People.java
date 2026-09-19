package com.qiyuesan.adstract;

public abstract class  People {
    public final void write(){
        System.out.println("\t随笔");
        System.out.println("今天是第一天");
        writeBaby();
        System.out.println("今天结束了~~");
    }
    public abstract void writeBaby();
}
