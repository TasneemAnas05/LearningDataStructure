package week4;

public class Demo2 {

    public static <T> void print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> void print(T x, T y) {
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void main(String[] args) {
        Integer[] i = {7, 4, 1};
        Double[] ai = {7.25, 4.5, 1.75};
        Bag[] b = {new Bag("Apple"), new Bag("Banana")};
        print(i);
        print(ai);
        print(b);
        int id = 202020;
        String name = "Tasnim";
        print(name,id);
    }
}
