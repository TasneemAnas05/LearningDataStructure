
package linkedlist;

public class App2 {
     public static void main(String[] args) {
        LLNode<Integer> list;

        LLNode<Integer> n1 = new LLNode(5);
        LLNode<Integer> n2 = new LLNode(15);
        LLNode<Integer> n3 = new LLNode(7);

        n1.setLink(n2);
        n2.setLink(n3);
        list = n1;

        n1 = n2 = n3 = null;

        // How to print all element in linkedlist except last one?
        System.out.println("Print all except last one");
        printAllExceptLast(list);
        // How to print last element in linkedlist?
        System.out.println("Print Last");
        printLast(list);
        // How to print all element ?
        System.out.println("Print All");
        printAll(list);

        //How to delete first node?
        System.out.println("Delete First");
        list = DeleteFirst(list);

        // How to print all element ?
        System.out.println("Print All");
        printAll(list);

        //How to delete last node?
        System.out.println("Delete Last");
        DeleteLast(list);

        // How to print all element ?
        System.out.println("Print All");
        printAll(list);

        // How to add new node at the begining?
        System.out.println("Add First:");
        list = addFirst(list, 5);

        // How to print all element ?
        System.out.println("Print All");
        printAll(list);

        // How to count all elements ?
        System.out.println("Size = " + getSize(list));

        // How to count odd elements ?
        System.out.println("Odd nodes = " + countOdd(list));

        // How to add new node at the end?
        System.out.println("Add Last:");
        addLast(list, 5);
        addLast(list, 10);
        printAll(list);

        // How to count by any value?
        System.out.println("countByValue: " + countByValue(list, 10));

        // How to add new node at the middle?
        System.out.println("addMiddle:");
        addMiddle(list, 20);
        printAll(list);

        // How to remove all?
        System.out.println("removeAll:");
        list = removeAll(list);
    }

    public static <T> LLNode<T> removeAll(LLNode<T> list) {
        return null;
    }

    public static <T> void addMiddle(LLNode<Integer> list, T value) {
        int middle = getSize(list) / 2;
        if (middle < 1) {
            return;
        }
        LLNode<Integer> n = new LLNode(value);
        for (int i = 1; i < middle; i++) {
            list = list.getLink();
        }
        n.setLink(list.getLink());
        list.setLink(n);
    }

    public static <T> int countByValue(LLNode<T> list, T value) {
        int counter = 0;
        while (list != null) {
            if (list.getInfo().equals(value)) {
                counter++;
            }
            list = list.getLink();
        }
        return counter;
    }

    public static <T> void addLast(LLNode<T> list, T value) {
        LLNode<T> n = new LLNode(value);
        while (list.getLink() != null) {//Stop on tha last Node
            list = list.getLink();
        }
        list.setLink(n);
    }

    public static int countOdd(LLNode<Integer> list) {
        int counter = 0;
        while (list != null) {
            if (list.getInfo() % 2 != 0) {
                counter++;
            }
            list = list.getLink();
        }
        return counter;
    }

    public static int getSize(LLNode<Integer> list) {
        int counter = 0;
        while (list != null) {
            counter++;
            list = list.getLink();
        }
        return counter;
    }

    public static LLNode<Integer> addFirst(LLNode<Integer> list, Integer value) {
        LLNode<Integer> n = new LLNode(value);
        n.setLink(list);
        return n;
    }

    public static void DeleteLast(LLNode<Integer> list) {
        //LLNode<Integer> temp = list;
        while (list.getLink().getLink() != null) {
            list = list.getLink();
        }
        list.setLink(null);
    }

    public static <T> LLNode<T> DeleteFirst(LLNode<T> list) {
        return list.getLink();
    }

    public static void printAll(LLNode<Integer> list) {
        LLNode<Integer> temp = list;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getLink();
        }
    }

    public static void printAllExceptLast(LLNode<Integer> list) {
        LLNode<Integer> temp = list;
        while (temp.getLink() != null) {
            System.out.println(temp.getInfo());
            temp = temp.getLink();
        }
    }

    public static void printLast(LLNode<Integer> list) {
        LLNode<Integer> temp = list;
        while (temp.getLink() != null) {
            temp = temp.getLink();
        }
        System.out.println(temp.getInfo());
    }
}
