package week4;

import week3.Contact;

public class Demo4 {

    public static void main(String[] args) {
        Collection<Integer> c1 = new Collection();
        c1.add(5);
        Collection<Double> c2 = new Collection();
        c2.add(7.25);
        Collection<Bag> c3 = new Collection();
        Bag<String> b1 = new Bag("Banana");
        c3.add(b1);
        c3.add(new Bag(c1));
        c3.add(new Bag<Double>(5.25));
        c3.print();
        Collection c4 = new Collection();
        c4.add(5.27);
        
        
   /* Bag b1=new Bag (7);
    Bag b2=new Bag("Apple");*/
    
//    Bag<Integer>b1=new Bag(7);
//    Bag<String>b2 =new Bag("Apple");
//    Bag<Double>b3 =new Bag(9.25);
//    Bag<Contact>b4 =new Bag(new Contact(2, "Tasnim"));
//    Bag<Bag>b5 =new Bag(b1);
//    
    
    
    
    
    

    }
}
