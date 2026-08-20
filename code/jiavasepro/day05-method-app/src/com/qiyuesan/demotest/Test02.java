package com.qiyuesan.demotest;

public class Test02 {
    public static void main(String[] args) {
        //比较数组
        int[] arr1 = null;
        int[] arr2 = {11,22,33,44,55};
        System.out.println(equal(arr1, arr2));

    }
    public static boolean equal(int[] arr1,int[] arr2){
        if(arr1 == null && arr2 == null){
            return true;
        }
        if(arr1 == null || arr2 == null){
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
            }
            return false;
        }
        return true;
    }






}
