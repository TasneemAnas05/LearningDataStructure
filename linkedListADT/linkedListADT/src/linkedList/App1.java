
package linkedList;


public class App1 {
    public static void main(String[] args) {
        RefUnsortedList<Character> list = new  RefUnsortedList();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('C');
        System.out.println(list);
        RefSortedList<Character> list2 = new  RefSortedList();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('C');
        System.out.println(list2);
        
    }
}
