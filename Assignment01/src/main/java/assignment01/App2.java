
package assignment01;

import lists.ArrayUnsortedList;

public class App2 {
    public static void main(String[] args) {
        // to test Slice() method in the ArrayUnsortedList class
        ArrayUnsortedList<Integer> l = new ArrayUnsortedList();
        l.add(5);
        l.add(7);
        l.add(10);
        l.add(12);
        l.add(8);
        System.out.println(l.slice(2,5 )); 
        // F=0 , L=0 => null
        // F=9 , L=0 => null
        // F=4 , L=2 => null
    }
}
