
package lists;

public class App1 {
    public static void main(String[] args) {
         ArrayUnsortedList<Integer> list = new ArrayUnsortedList();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        System.out.println(" - Print All List Items: ");
        System.out.println(list.toString());
        System.out.println(" - Print First Item: ");
        System.out.println(list.getNext());
        System.out.println(" - Print Second Item: ");
        System.out.println(list.getNext());
        System.out.println(" - Print First Item (After Reset): ");
        list.reset();
        System.out.println(list.getNext());
        System.out.println(" - Print Last Item (After Reset): ");
        list.reset();
        list.getNext();
        list.getNext();
        System.out.println(list.getNext());

        System.out.println(" - Print Last Item (Using For Loop): ");
        list.reset();
        for (int i = 1; i < list.size(); i++) {
            list.getNext();
        }
        System.out.println(list.getNext());

        System.out.println(" - Print Last 2 Items (Using For Loop): ");
        int numberOfLastItems = 2;
        list.reset();
        for (int i = 1; i <= list.size() - numberOfLastItems; i++) {
            list.getNext();
        }
        for (int i = 1; i <= numberOfLastItems; i++) {
            System.out.println(list.getNext());
        }

        System.out.println(" - Print First 2 Items (Using For Loop): ");
        int numberOfFirstItems = 2;
        list.reset();
        for (int i = 1; i <= numberOfFirstItems; i++) {
            System.out.println(list.getNext());
        }
        /*
        System.out.println(" - Remove Item value = 7");
        list.remove(7);
        System.out.println(" - Print All List Items: ");
        System.out.println(list.toString());
        
        System.out.println(" - Remove Item value = 5");
        list.remove(5);
        System.out.println(" - Print All List Items: ");
        System.out.println(list.toString());
         */

        System.out.println(" - Remove All Item value = 7");
        while (list.remove(7)){}
        System.out.println(" - Print All List Items: ");
        System.out.println(list.toString());
        
        System.out.print(" - Find item value = 5? ");
        System.out.println(list.contains(5));
        
        System.out.print(" - Echo = 3? ");
        System.out.println(list.get(3));
    }
    }

