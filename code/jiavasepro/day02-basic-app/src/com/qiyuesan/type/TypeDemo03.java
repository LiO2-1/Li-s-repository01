package com.qiyuesan.type;

public class TypeDemo03 {
    public static void main(String[] args) {
        // 强制类型转换
        //数据类型 变量2 =（数据类型)变量1
        int a =10;
        byte b = (byte) a; //AIT+ENTER
        //强转可能会导致数据丢失
        //当浮点型强制转给整型时，会直接丢掉小数部分。
    }
}
