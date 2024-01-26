package doublylinkedlist;

/**
 *
 * @author Dr. Mahmood
 */
public class App1 {

    public static void main(String[] args) {
        DLLNode<Integer> dList = null;

        DLLNode<Integer> n1 = new DLLNode<>(3);
        DLLNode<Integer> n2 = new DLLNode<>(8);
        DLLNode<Integer> n3 = new DLLNode<>(5);
        DLLNode<Integer> n4 = new DLLNode<>(2);

        n1.setFront(n2);

        n2.setBack(n1);
        n2.setFront(n3);

        n3.setBack(n2);
        n3.setFront(n4);

        n4.setBack(n3);

        dList = n1;
        n1 = n2 = n3 = n4 = null;

        System.out.println("----- Forward traverse -----");
        DLLNode<Integer> temp = dList;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getFront();
        }

        System.out.println("----- Backward traverse -----");
        temp = dList;
        while (temp.getFront() != null) {
            temp = temp.getFront();
        }
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getBack();
        }
    }

}
