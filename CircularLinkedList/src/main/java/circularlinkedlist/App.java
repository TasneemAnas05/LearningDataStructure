

package circularlinkedlist;


public class App{

    public static void main(String[] args) {
        LLNode<Integer> cll = null;
        cll = addFirst(cll, 5);
        cll = addFirst(cll, 10);
        cll = addFirst(cll, 2);
        cll = addFirst(cll, 7);
        print(cll);
        cll = addLast(cll, 55);
        print(cll);
    }


    public static <T> void print(LLNode<T> cll) {
        if (cll == null) {
            System.out.println("Empty Circular Linked List");
        } else {
            LLNode<T> temp = cll.getLink();
            do {
                System.out.println(temp.getInfo());
                temp = temp.getLink();
            } while (temp != cll.getLink());
        }
    }
    //using while loop => simpler
//    public static <T> void print2(LLNode<T> cll) {
//        if (cll == null) {
//            System.out.println("Empty Circular Linked List");
//        } else {
//            LLNode<T> temp = cll.getLink();
//            while (temp != cll){
//                System.out.println(temp.getInfo());
//                temp = temp.getLink();
//            } 
//            System.out.println(temp.getInfo());
//        }
//    }
    public static <T> LLNode<T> addLast(LLNode<T> cll, T value) {
        LLNode<T> n = new LLNode(value);
        if (cll == null) {
            n.setLink(n);
            cll = n;
        } else {
            n.setLink(cll.getLink());
            cll.setLink(n);
            cll=n;//important ******
        }
        return cll;
    }
    public static <T> LLNode<T> addFirst(LLNode<T> cll, T value) {
        LLNode<T> n = new LLNode(value);
        if (cll == null) {
            n.setLink(n);
            cll = n;
        } else {
            n.setLink(cll.getLink());
            cll.setLink(n);
        }
        return cll;
    }
}
