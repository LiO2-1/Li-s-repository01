package com.qiyuesan.testdemo;

public class Demo05 {
    public static void main(String[] args) {
        //拷贝
        int[] arr ={11,22,33,44};
        int[] arr2 = copy(arr);
        change(arr2);
        System.out.println(arr); //地址不一样
        System.out.println(arr2);//地址不一样
    }
    public static int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public static void change(int[] arr){
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
