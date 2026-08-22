package com.qiyuesan.testdemo;

import java.util.Random;
import java.util.Scanner;

public class Demo10 {
    //开发双色球的模型
    public static void main(String[] args) {
        //用户输入的号码
        int[] userSelectNumber =userSelectNumber();
        //打印选出来的号码
//        print(userSelectNumber);
        //中奖号码
        int[] luckNumber =luckNumber();
//        print(luckNumber);
        //核对号码
        check(userSelectNumber,luckNumber);
        //查验号码
        verify(userSelectNumber,luckNumber);


    }
    public static int[] userSelectNumber(){
        //用户输入的号码
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length-1; i++) {
            while (true) {
                System.out.println("请选择您第" + (i+1) + "个号码(1~33之间，不能重复！)：");
                int number = sc.nextInt();
                //判断号码是否在1~33之间
                if(number < 1 || number > 33){
                    System.out.println("您输入的号码有误，请重试~~");
                }else{
                    //判断号码是否重复
                    if (exist(numbers,number )) {
                        //号码重复
                        System.out.println("您输入的号码重复，请重试~~");
                    }else{
                        //号码不重复
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            //最后一个号码
            System.out.println("请输入最后一个蓝球号码");
            int number1 = sc.nextInt();
            if(number1 < 1 || number1 >16 ){
                System.out.println("您输入的号码有误，请重试~~");
            }else{
                numbers[6] = number1;
                break;
            }
        }
        return numbers;
    }

    public static boolean exist(int[] numbers, int number) {
        //判断是否重复
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number){
                return true;
            }
        }
        return false;
    }
    public static void print(int[] arr){
        //打印号码
        if(arr == null){
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] :arr[i]+", ");
        }
        System.out.println("]");
    }

    public static int[] luckNumber(){
        Random r = new Random();
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length-1; i++) {
            while (true) {
                int number = r.nextInt(1,34);
                //判断号码是否在1~33之间
                    //判断号码是否重复
                    if (exist(numbers,number )) {
                        //号码重复
                    }else{
                        //号码不重复
                        numbers[i] = number;
                        break;
                    }
            }
        }
        while (true) {
            //最后一个号码
            int number1 = r.nextInt(1,17);
                numbers[6] = number1;
                break;
        }
        return numbers;
    }

    public static void check(int[] userSelectNumber,int[] luckNumber){
        //核对奖项
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < 5; i++) {
            if(userSelectNumber[i] == luckNumber[i]){
                count++;
            }
        }
            if(userSelectNumber[6] == luckNumber[6]){
                count1++;
            }

        int count2 = count + count1;
        switch (count2){
            case 0:
                System.out.println("很遗憾，您未中奖~~");
                break;
            case 1:
            case 2:
                System.out.println("恭喜你获得5元。");
                break;
            case 3:
            case 4:
                System.out.println("恭喜您获得10元。");
                break;
            case 5:
                System.out.println("恭喜您获得200元！");
                break;
            case 6:
                if(count == 6){
                System.out.println("运气爆棚，恭喜您获得500万大奖！！！");
                break;
                }else{
                    System.out.println("恭喜你获得2000元奖金！！！");
                    break;
                }
            case 7:
                System.out.println("运气爆棚，恭喜你获得1000万元大奖！！！");
                break;
        }
    }
    public static void verify(int[] userSelectNumber,int[] luckNumber){
        Scanner sc = new Scanner(System.in);
        System.out.println("您是否需要查验？");
            String sr = sc.next();
            switch (sr){
                case "是":
                    System.out.println("下面是您的号码：");
                    print(userSelectNumber);
                    System.out.println("下面是中奖号码：");
                    print(luckNumber);
                    break;
                case "否":
                    System.out.println("感谢您的光临~~");
                    break;
                default:
                    System.out.println("输入错误~~请重试。");
                    break;
            }
    }
}