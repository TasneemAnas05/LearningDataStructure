package week5;

public interface ICollection<T> {

    public  final int SIZE = 100;
    
    public abstract void add(T item);

    boolean isFull();

    void remove();

    boolean isEmpty();

    void print();

    int getSize();
}
