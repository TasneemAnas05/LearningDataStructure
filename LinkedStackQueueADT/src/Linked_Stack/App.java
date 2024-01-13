package Linked_Stack;

public class App {

    public static void main(String[] args) {
        LinkedStack<Character> s = new LinkedStack();
        s.push('A');
        s.push('B');
        s.push('C');
        print(s);
        s.pop();
        s.push('D');
        print(s);
    }

    public static <T> void print(LinkedStack<T> s) {
        LinkedStack<T> t = new LinkedStack();
        while (!s.isEmpty()) {
            T item=s.top();
            t.push(item);
            System.out.println(item);//to print in the reverse order
            s.pop();
        }
        while (!t.isEmpty()) {
            T item = t.top();
           // System.out.println(item); print in the correct order
            s.push(item);
            t.pop();
        }
    }
}
