package com.qiyuesan.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperate {
    ArrayList<Foods> foodList = new ArrayList<>();

    public void addFood(){
        //添加菜品
        Scanner sc = new Scanner(System.in);
        Foods food = new Foods();
        System.out.println("请输入菜品名称：");
        String name = sc.next();
        food.setName(name);
        System.out.println("请输入菜品价格：");
        double price = sc.nextDouble();
        food.setPrice(price);
        System.out.println("请输入菜品描述：");
        String desc = sc.next();
        food.setDesc(desc);

        foodList.add(food);
        System.out.println("上架成功！！！");
    }
    public void showFood(){
        //展示菜品
        if(foodList.size() == 0){
            System.out.println("现在库中没有商品，请先上架~~");
        }
        for (int i = 0; i < foodList.size(); i++) {
            Foods s = foodList.get(i);
            System.out.println("名称："+s.getName());
            System.out.println("价格："+s.getPrice());
            System.out.println("描述："+s.getDesc());
            System.out.println("--------------------------------------");
        }
    }
    public void start(){
        //开始程序
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎~~");
        while (true) {
            System.out.println("1.上架菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出");
            System.out.println("请输入您的指令：");
            String command = sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showFood();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("您的指令不存在，请重试~~");
            }
        }

    }
}
