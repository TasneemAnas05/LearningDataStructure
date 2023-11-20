package week4;


public class Demo5 {
    public static void main(String[] args) {
        Dictionary<Integer,String> d1 = new Dictionary(1,"Tasnim");
        Bag<String> b1 = new Bag("Banana");
        Dictionary<Integer,Bag<String>> d2 = new Dictionary(1,b1);
        Collection<Character> c1 = new Collection();
        c1.add('A');
        c1.add('B');
        c1.add('C');
        c1.remove();
        Dictionary<Bag<String>,Collection<Character>> d3 = new Dictionary(b1,c1);
        System.out.println(d3);
        
        
    }
    
}
