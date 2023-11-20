package week4;

public class Collection<T> {

    private int index = -1;
    private final T[] ar;
    private final int SIZE = 100;

    public Collection() {
        ar = (T[]) new Object[SIZE];
    }

    public Collection(int capacity) {
        ar = (T[]) new Object[capacity];
    }

    public boolean isFull() {
        return index == ar.length - 1;
    }

    public void add(T value) {
        if (!isFull()) {
            ar[++index] = value;
        }
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public void remove() {
        if (!isEmpty()) {
            index--;
        }
    }

    public int getSize() {
        return index + 1;
    }

    public void print() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(ar[i]);
        }
    }
}
