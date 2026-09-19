package com.qiyuesan.operator;

public class OperatorDemo05 {
    public static void main(String[] args) {
        // 掌握逻辑运算符
        //例：要求手机必须满足尺寸大小等于6.95，内存必须大于等于8GB
        double size =9.8;
        int storage =16;
        // 1. &   都是true
        boolean rs = size >=6.95 & storage >=8;
        System.out.println(rs);

        //例：要求手机必须满足尺寸大小等于6.95，或内存必须大于等于8GB
        // 2. |   只要一个是true
        boolean rs1 = size >=6.95 | storage >=8;
        System.out.println(rs1);

        // 3. !   取反
        System.out.println(!true);  //----false

        // 4. ^  前后结果相同时返回false，相反返回true.

        // 5. && 左边为false,右边不执行。
        int n =10;
        int m =20;
        System.out.println(n>100 && ++m>99);
        System.out.println(m);    //----20

        // 6. || 左边为true,右边不执行。
        int i =10;
        int j =20;
        System.out.println(i > 1 || ++j>10);
        System.out.println(j);    //----20

    }
}
