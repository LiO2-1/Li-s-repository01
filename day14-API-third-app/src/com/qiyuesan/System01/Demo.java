package com.qiyuesan.System01;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("E:\\常用软件\\Wuthering Waves\\launcher.exe");
        Thread.sleep(10000);
        p.destroy();
    }
}
