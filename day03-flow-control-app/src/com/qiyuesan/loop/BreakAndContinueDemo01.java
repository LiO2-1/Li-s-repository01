package com.qiyuesan.loop;

public class BreakAndContinueDemo01 {
    public static void main(String[] args) {
        // 1. break
        //5天，每天3遍“我爱你”，第3天后结束
        for (int i = 1; i <= 5; i++) {
            System.out.println("我爱你"+ i);
            if(i == 3){
                break;
            }
        }

        System.out.println("---------------------------");


        // 2. continue
        //5天，每天3遍“我爱你”，第3天不用，以后接着说。
        for (int i = 1; i <= 5; i++) {
            if(i==3){
                continue;
            }
            System.out.println("我爱你"+ i);
        }
    }
}
