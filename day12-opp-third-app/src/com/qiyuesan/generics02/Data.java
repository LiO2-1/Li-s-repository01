package com.qiyuesan.generics02;

import java.util.ArrayList;

public interface Data<E> {
    void add(E e);

    ArrayList<E> getName(String name);
}
