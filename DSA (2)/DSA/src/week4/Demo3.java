package week4;

public class Demo3 {

    public static void main(String[] args) {
        Bag<String> b1 = new Bag<>("Apple");
        Bag<Integer> b2 = new Bag<>(5);
        Bag<Double> b3 = new Bag<>(3.5);
        Bag b4 = new Bag<>('A');
        
        System.out.println("b1: " + b1.getItem());
        System.out.println("b2: " + b2.getItem());
        System.out.println("b3: " + b3.getItem());
        System.out.println("b4: " + b4.getItem());

        
    }

}
