package com.qiyuesan.define;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //掌握数组的访问
        int [] ages = {14,23,4,5,32};

        // 1. 访问数组的数据
        System.out.println(ages[2]);

        // 2. 修改数组的数据
        ages[0] = 18;
        System.out.println(ages[0]);

        // 3. 访问数组的元素个数 数组名.length
        System.out.println(ages.length);

        //技巧：获取数组的最大索引
        System.out.println(ages.length - 1);
    }
}
