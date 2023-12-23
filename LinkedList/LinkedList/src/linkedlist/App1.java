package linkedlist;

public class App1 {

    public static void main(String[] args) {
        LLNode<Integer> list;

        LLNode<Integer> x1 = new LLNode(5);
        LLNode<Integer> x2 = new LLNode(15);
        LLNode<Integer> x3 = new LLNode(7);

        x1.setLink(x2);
        x2.setLink(x3);
        list = x1;

        System.out.println("x1 info: " + x1.getInfo());
        System.out.println("x2 info: " + x2.getInfo());
        System.out.println("x3 info: " + x3.getInfo());

        x1 = x2 = x3 = null;

        //System.out.println("x1 info: " + x1.getInfo());
        //System.out.println("x2 info: " + x2.getInfo());
        //System.out.println("x3 info: " + x3.getInfo());
        System.out.println("x1 info: " + list.getInfo());
        System.out.println("x2 info: " + list.getLink().getInfo());
        System.out.println("x3 info: " + list.getLink().getLink().getInfo());

        /*
        while (list.getLink() != null) {
            System.out.println(list.getInfo());
            list = list.getLink();
        }
        System.out.println(list.getInfo());
         */
        LLNode<Integer> temp = list;
        while (temp.getLink() != null) {
            System.out.println(temp.getInfo());
            temp = temp.getLink();
        }
        System.out.println(temp.getInfo());

        print(list);
    }

    public static void print(LLNode<Integer> list) {
        LLNode<Integer> temp = list;
        while (temp.getLink() != null) {
            System.out.println(temp.getInfo());
            temp = temp.getLink();
        }
        System.out.println(temp.getInfo());
    }
}
