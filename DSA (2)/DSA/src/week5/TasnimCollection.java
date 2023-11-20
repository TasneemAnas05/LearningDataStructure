package week5;

public class TasnimCollection<T> implements ICollection<T> {

    private int index = -1;
    private final T[] ar;

    public TasnimCollection() {
        ar = (T[]) new Object[SIZE];
    }

    public TasnimCollection(int capacity) {
        ar = (T[]) new Object[capacity];
    }

    @Override
    public boolean isFull() {
        return index == ar.length - 1;
    }

    @Override
    public void add(T value) {
        if (!isFull()) {
            ar[++index] = value;
        }
    }

    @Override
    public boolean isEmpty() {
        return index == -1;
    }

    @Override
    public void remove() {
        if (!isEmpty()) {
            index--;
        }
    }

    @Override
    public int getSize() {
        return index + 1;
    }

    @Override
    public void print() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(ar[i]);
        }
    }

}
