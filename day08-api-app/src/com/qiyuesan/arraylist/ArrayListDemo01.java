package com.qiyuesan.arraylist;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //建立一个集合对象
        ArrayList list = new ArrayList();

        //1.将指定的元素添加到此集合的末尾
        list.add("li");
        list.add("guo");
        list.add("xing");
        list.add(520);
        System.out.println(list);

        //2.在此集合中的指定位置插入指定的元素
        list.add(4,"java");
        System.out.println(list);

        //3.返回指定索引处的元素
        list.get(3);  // 520

        //4.返回集合中的元素的个数
        System.out.println(list.size());  // 5

        //5.删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(4));
        System.out.println(list);

        //6.删除指定的元素，返回删除是否成功
        System.out.println(list.remove("li"));
        System.out.println(list);

        //7.修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(2, 521));
        System.out.println(list);


    }
}
