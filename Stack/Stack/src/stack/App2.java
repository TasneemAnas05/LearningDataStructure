package stack;

public class App2 {

    public static void printStack(ArrayBoundedStack<Integer> g) {
        System.out.println("Stack has the following elements : ");
        ArrayBoundedStack<Integer> temp = new ArrayBoundedStack<>();
        while (!g.isEmpty()) {
            System.out.println(g.top());
            temp.push(g.top());
            g.pop();
        }
        while (!temp.isEmpty()) {
            g.push(temp.top());
            temp.pop();
        }
    }

    public static void removeNegatives(ArrayBoundedStack<Integer> r) {
        ArrayBoundedStack<Integer> g = new ArrayBoundedStack<>();
        while (!r.isEmpty()) {
            if (r.top() < 0) {
                r.pop();
            } else {
                g.push(r.top());
                r.pop();
            }
        }
        while (!g.isEmpty()) {
            r.push(g.top());
            g.pop();
        }
    }
    public static int getStackSize(ArrayBoundedStack<Integer> g){
        int n = 0;
        ArrayBoundedStack<Integer> temp = new ArrayBoundedStack<>();
        while (!g.isEmpty()) {            
            temp.push(g.top());
            g.pop();
            ++n;
        }
        while (!temp.isEmpty()) {
            g.push(temp.top());
            temp.pop();
        }
        return n;
    }
    public static void main(String[] args) {
        ArrayBoundedStack<Integer> g = new ArrayBoundedStack<>(10);
        g.push(12);
        g.push(-1);
        g.push(-9);
        g.push(350);
        g.push(87);
        System.out.println("Stack contains : "+getStackSize(g)+" elements");
        printStack(g);        
        removeNegatives(g);
        System.out.println("Stack contains : "+getStackSize(g)+" elements");
        printStack(g);
    }

}
