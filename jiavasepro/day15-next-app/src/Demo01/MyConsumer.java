package Demo01;
@FunctionalInterface
public interface MyConsumer<E>{
    void accept(E e);
}
