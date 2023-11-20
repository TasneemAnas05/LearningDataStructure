package week4;

public class Bag <T>{

    private T item;

    public Bag(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Bag{" + "item=" + item + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(obj instanceof Bag)
            return getItem().equals(((Bag)obj).getItem());
        return false;
    }
}
