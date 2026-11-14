package Demo01;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private Object[] Date;
    private int size;
    private int time = 10;

    public boolean add(E e){
       if(size == Date.length){
           grow();
       }
       Date[size++] = e;
        return true;
    }

    public void grow(){
        if(size == 0){
            Date = new Object[time];
        }else{
            Date = Arrays.copyOf(Date,Date.length+Date.length >> 1);
        }
    }

    public E get(int index){
        check(index);
        E e = (E)Date[index];
        return e;
    }

    public void check(int index){
        if(index >= Date.length){
            throw new IndexOutOfBoundsException(index +"out of max length"+size);
        }
    }

    public E remove(int index){
        check(index);
        E a = (E)Date[index];
        int moveFlag = size - index - 1;
        if(moveFlag != 0) {
            System.arraycopy(Date, index, Date, index + 1, moveFlag);
        }
        Date[--size] = null;
        return a;
    }

    public int size(){
        return size;
    }

    public void ForEach(MyConsumer action){
        Objects.requireNonNull(action);
        for (int i = 0; i < size; i++) {
            action.accept((E)Date[i]);
        }
    }
}
