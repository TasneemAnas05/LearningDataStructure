/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

public class App1 {

    public static void printStack(ArrayBoundedStack<Integer> g) {
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

    public static <T> void transferStacks(ArrayBoundedStack<T> t1, ArrayBoundedStack<T> t2, ArrayBoundedStack<T> t3) {
        for (int i = 1; i <= 3; i++) {
            t2.push(t1.top());
            t1.pop();
        }
        while (!t1.isEmpty()) {
            t3.push(t1.top());
            t1.pop();
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 3, 5, 7, 9, 11};
        ArrayBoundedStack<Integer> s = new ArrayBoundedStack<>();
        for (int i = 0; i < values.length; i++) {
            s.push(values[i]);
        }
        int n = 25;
        for (int i = 0; i < 4; i++) {
            n += s.top();
            s.pop();
        }
        for (int i = 0; i < 2; i++) {
            n -= s.top();
            s.pop();
        }
        System.out.println(n);

    }
}
