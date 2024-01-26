package doublylinkedlist;

public class App {

    public static void main(String[] args) {
        DLLNode<Integer> dList = null;
        dList = addFirst(dList, 5);
        dList = addFirst(dList, 2);
        dList = addFirst(dList, 10);
        print(dList);
        printReverse(dList);
        printOddReverseEven(dList);
        dList = addLast(dList, 55);
        print(dList);
        dList = addLast(dList, 66);
        print(dList);
        System.out.println("Size: " + count(dList));
        DeleteMiddle(dList);
        print(dList);
    }

    public static <T> void DeleteMiddle(DLLNode<T> d) {
        int counter = 0;
        while (d.getFront() != null) {
            counter++;
            d = d.getFront();
        }
        counter++;
        if (counter < 3 || counter % 2 == 0) {
            return;
        }
        int middle = counter / 2 + 1;
         while (d != null) {
            if(counter--==middle){
                d.getBack().setFront(d.getFront());
                d.getFront().setBack(d.getBack());
            }
            d = d.getBack();
        }
    }

    public static <T> int count(DLLNode<T> d) {
        int counter = 0;
        while (d != null) {
            counter++;
            d = d.getFront();
        }
        return counter;
    }

    public static <T> boolean find(DLLNode<T> d, T value) {
        while (d != null) {
            if (d.getInfo().equals(value)) {
                return true;
            }
            d = d.getFront();
        }
        return false;
    }

    public static <T> int countByValue(DLLNode<T> d, T value) {
        int counter = 0;
        while (d != null) {
            if (d.getInfo().equals(value)) {
                counter++;
            }
            d = d.getFront();
        }
        return counter;
    }

    public static <T> DLLNode<T> addLast(DLLNode<T> d, T value) {
        DLLNode<T> n = new DLLNode(value);
        if (d == null) {
            return n;
        }
        DLLNode<T> t = d;
        while (t.getFront() != null) {
            t = t.getFront();
        }
        t.setFront(n);
        n.setBack(t);
        return d;
    }

    public static void printOddReverseEven(DLLNode<Integer> d) {
        System.out.println("------------------------");
        while (d.getFront() != null) {
            //Integer v = Integer.parseInt(d.getInfo().toString());
            Integer v = d.getInfo();
            if (v % 2 != 0) {
                System.out.println(v);
            }
            d = d.getFront();
        }
        if (d.getInfo() % 2 != 0) {
            System.out.println(d.getInfo());
        }
        System.out.println("-----------------");
        while (d != null) {
            Integer v = d.getInfo();
            if (v % 2 == 0) {
                System.out.println(v);
            }
            d = d.getBack();
        }
    }

    public static <T> void printReverse(DLLNode<T> d) {
        System.out.println("------------------------");
        while (d.getFront() != null) {
            d = d.getFront();
        }
        while (d != null) {
            System.out.println(d.getInfo());
            d = d.getBack();
        }
    }

    public static <T> void print(DLLNode<T> d) {
        System.out.println("------------------------");
        while (d != null) {
            System.out.println(d.getInfo());
            d = d.getFront();
        }
    }

    public static <T> DLLNode<T> addFirst(DLLNode<T> d, T value) {
        DLLNode<T> n = new DLLNode(value);
        if (d != null) {
            n.setFront(d);
            d.setBack(n);
        }
        return n;
    }
}
