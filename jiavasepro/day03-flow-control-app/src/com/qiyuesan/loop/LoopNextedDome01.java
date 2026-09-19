package com.qiyuesan.loop;

public class LoopNextedDome01 {
    public static void main(String[] args) {
        //掌握循环嵌套
        //三天，每天5遍”我爱你！！！“
        for(int i =1;i <=3;i++){
            for(int j =1;j <=5; j++){
                System.out.println("我爱你！！！,这是第"+i+"天！");
            }
            System.out.println("------------------------");
        }
      //打印
        //    ****
        //    ****
        //    ****

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
