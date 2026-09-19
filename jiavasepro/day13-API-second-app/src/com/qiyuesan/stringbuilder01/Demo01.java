package com.qiyuesan.stringbuilder01;

public class Demo01 {
    public static void main(String[] args) {
        //好处：性能好
        StringBuilder s1 = new StringBuilder("赤壁");
        //添加
        s1.append(22);
        s1.append(true);
        s1.append(12).append("liguoxing");
        System.out.println(s1);

        //反转
        s1.reverse();
        System.out.println(s1);

        //转化为字符串
        String s2 = s1.toString();
        System.out.println(s2);

        //返回对象长度
        System.out.println(s2.length());
    }
}
