package week4;

public class Demo1 {

    public static <T> T print(T value) {
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        int i = 4;      //4-byte
        i = print(i);
        System.out.println("i: " + i);
        float f = 4.0F;  //4-byte
        f = print(f);
        System.out.println("f: " + f);

        double d = 8.0;   //8-byte
        print(d);

        long l = 8L;      //8-byte
        print(l);

        Bag b = new Bag("Banana");
        print(b);

        char c = 'A';
        print(c);

    }
}
