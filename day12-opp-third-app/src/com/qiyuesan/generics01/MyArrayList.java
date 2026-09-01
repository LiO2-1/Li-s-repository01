package com.qiyuesan.generics01;

public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int size;

    public Boolean add(E e){
        arr[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)arr[size];
    }
}
