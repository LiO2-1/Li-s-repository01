package com.qiyuesan.demotest;

public class Test01 {
    public static void main(String[] args) {
        //打印【11，22，33，44，55】
        int[] arr = {11,22,33,44,55};
        change(arr);
        int[] arr1 = null;
        change(arr1);
    }

    public static void change(int[] arr){
        if(arr == null){
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if(i==arr.length-1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i]+", ");
//            }
            System.out.print(i == arr.length-1 ? arr[i] :arr[i]+", ");
        }
        System.out.println("]");
    }
}
