package Linked_Queue;

public class App {

    public static void main(String[] args) {
        LinkedQueue<Character> q = new LinkedQueue();
        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');
        print(q);
        q.dequeue();
        q.enqueue('D');
        print(q);
    }

    public static <T> void print(LinkedQueue<T> q) {
        LinkedQueue<T> t = new LinkedQueue();
        while (!q.isEmpty()) {
            T item = q.dequeue();
            System.out.println(item);
            t.enqueue(item);
        }
        while (!t.isEmpty()) {
            q.enqueue(t.dequeue());
        }
    }
}
