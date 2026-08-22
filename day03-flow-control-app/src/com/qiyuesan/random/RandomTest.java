package com.qiyuesan.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int LuckNumber = r.nextInt(1000)+1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("输入您的猜测：");
            int GuessNumber = sc.nextInt();
            if( GuessNumber > LuckNumber){
                System.out.println("猜测过大~~");
            }else if( GuessNumber < LuckNumber ){
                System.out.println("猜测过小~~");
            }else{
                System.out.println("猜测正确~~");
                break;
            }
        }
    }
}
