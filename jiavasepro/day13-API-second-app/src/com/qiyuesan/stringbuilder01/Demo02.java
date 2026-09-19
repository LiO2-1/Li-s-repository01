package com.qiyuesan.stringbuilder01;

public class Demo02 {
    public static void main(String[] args) {
        //案例，转换数组
        System.out.println(getArrayData(new int[]{11, 11, 22}));
    }

    public static String getArrayData(int[] arr){
        StringBuilder s1 = new StringBuilder();
        s1.append("[");
        for (int i = 0; i <= arr.length-1; i++) {
            if(i == arr.length-1){
                s1.append(arr[i]);
                break;
            }
            s1.append(arr[i]).append(",  ");
        }
        s1.append("]");
        return s1.toString();
    }
}
