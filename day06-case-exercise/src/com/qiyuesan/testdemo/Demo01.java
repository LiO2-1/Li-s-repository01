package com.qiyuesan.testdemo;

public class Demo01 {
    public static void main(String[] args) {
        //买飞机票
        double price = calculate(485.0,6,"头等舱");
        System.out.println("您的优惠价为：" + price);


    }
    public static double calculate(double price,int month,String type){
        if(month >= 5 && month <= 10 ){
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else{
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
