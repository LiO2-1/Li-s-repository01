package com.qiyuesan.string;

public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "河马";
        //1.获取字符串的长度返回（就是字符个数）
        System.out.println(s1.length());  //  2

        //2.获取某个索引位置处的字符返回
        System.out.println(s1.indent(0)); //  河

        //3.将当前字符串转换成字符数组返回
        char[] s2 = s1.toCharArray();
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }

        //4.判断当前字符串与另一个字符串的内容一样，一样返回true
        String s3 = "我";
        String s4 = "我";
        System.out.println(s3.equals(s4)); // true

        //5.判断当前字符串与另一个字符串的内容是否一样(忽略大小写)
        String s5 = "S34eDb";
        String s6 = "s34EdB";
        System.out.println(s5.equalsIgnoreCase(s6));  //  true

        //6.根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        System.out.println(s5.substring(0, 3));  // S34e

        //7.从传入的索引处截取，截取到末尾，得到新的字符串返回
        System.out.println(s5.substring(2));    // 4eDb

        //8.使用新值，将字符串中的旧值替换，得到新的字符串
        String s7 = "你打游戏,和妈死了,一样！";
        System.out.println(s7.replace("妈死了", "***"));

        //9.判断字符串中是否包含了某个字符串
        System.out.println(s7.contains("妈")); // true

        //10.判断字符串是否以某个字符串内容开头，开头返回true，反之
        System.out.println(s7.startsWith("你")); // true

        //11.把字符串按照某个字符串内容分割，并返回字符串数组回来
        String[] s8 = s7.split(",");
        for (int i = 0; i < s8.length; i++) {
            System.out.println(s8[i]);
        }
    }
}
