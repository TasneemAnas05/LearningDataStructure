package week5;

public class Demo1 {
    public static void main(String[] args) {
        TasnimCollection<Integer> c1 = new TasnimCollection(3);
        c1.add(5);
        c1.add(8);
        c1.add(7);
        c1.add(3);
        c1.remove();
        c1.remove();
        c1.print();
        
    }
}
