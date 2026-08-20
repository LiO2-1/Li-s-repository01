package com.qiyuesan.arraylist;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //管理购物车
        ArrayList<String> goodCar = new ArrayList<>();
        goodCar.add("Java入门");
        goodCar.add("宁夏枸杞");
        goodCar.add("黑枸杞");
        goodCar.add("人字拖");
        goodCar.add("特级枸杞");
        goodCar.add("枸杞子");
        System.out.println("下面是您的购物车：");
        System.out.println(goodCar);
        for (int i = 0; i < goodCar.size(); i++) {
            String m = goodCar.get(i);
            if(m.contains("枸杞")){
                goodCar.remove(m);
                i--;
            }
        }
        System.out.println(goodCar);
    }
}
