package Linked_Stack;

import common.Student;

public class App2 {

    public static void main(String[] args) {
        Student s1 = new Student("Bader", 95);
        Student s2 = new Student("Ahmad", 45);
        Student s3 = new Student("Kareem", 98);
        Student s4 = new Student("Osama", 98);
        Student s5 = new Student("Heba", 90);
        Student s6 = new Student("Ali", 49);

        LinkedStack<Student> s = new LinkedStack();
        s.push(s1);
        s.push(s2);
        s.push(s3);
        s.push(s4);
        s.push(s5);
        s.push(s6);
        print(s);
        System.out.println("DeleteLessthan50:");
        DeleteLessthan50(s);
        print(s);
        System.out.println("CalculateStudentAverage:");
        System.out.println(CalculateStudentAverage(s));
        System.out.println("GetNameOfStudentMaxGpa:");
        System.out.println(GetNameOfStudentMaxGpa(s));
        System.out.println("ReorderTopStuent:");
        ReorderTopStuent(s);
        print(s);
        LinkedStack<Student> p = new LinkedStack();
        LinkedStack<Student> f = new LinkedStack();
        PassFaildStudents(s,p,f);
    }
    public static void ReverseStack(LinkedStack<Student>s){
        LinkedStack<Student> t1=new LinkedStack();
        LinkedStack<Student> t2=new LinkedStack();
        while(! s.isEmpty()){
            Student item=s.top();
            t1.push(item);
            s.pop();
        }
        while(! t1.isEmpty()){
            Student item=t1.top();
            t2.push(item);
            t1.pop();
        }
        while(! t2.isEmpty()){
            Student item=t2.top();
            s.push(item);
            t2.pop();
        }
    }
    public static void PassFaildStudents(LinkedStack<Student> s,
            LinkedStack<Student> p,
            LinkedStack<Student> f) {
        while (!s.isEmpty()) {
            Student item = s.top();
            if (item.getGpa() >= 50) {
                p.push(item);
            } else {
                f.push(item);
            }
            s.pop();
        }        
    }

    public static void ReorderTopStuent(LinkedStack<Student> s) {
        LinkedStack<Student> topStack = new LinkedStack();
        LinkedStack<Student> downStack = new LinkedStack();
        while (!s.isEmpty()) {
            Student item = s.top();
            if (item.getGpa() > 95) {
                topStack.push(item);
            } else {
                downStack.push(item);
            }
            s.pop();
        }
        while (!downStack.isEmpty()) {
            s.push(downStack.top());
            downStack.pop();
        }
        while (!topStack.isEmpty()) {
            s.push(topStack.top());
            topStack.pop();
        }
    }

    public static String GetNameOfStudentMaxGpa(LinkedStack<Student> s) {
        LinkedStack<Student> t = new LinkedStack();
        double maxGpa = s.top().getGpa();
        String name = s.top().getName();
        while (!s.isEmpty()) {
            Student item = s.top();
            if (item.getGpa() >= maxGpa) {
                maxGpa = item.getGpa();
                name = item.getName();
            }
            t.push(item);
            s.pop();
        }
        while (!t.isEmpty()) {
            s.push(t.top());
            t.pop();
        }
        return name;
    }

    public static double CalculateStudentAverage(LinkedStack<Student> s) {
        LinkedStack<Student> t = new LinkedStack();
        double sum = 0;
        int counter = 0;
        while (!s.isEmpty()) {
            Student item = s.top();
            sum += item.getGpa();
            counter++;
            t.push(item);
            s.pop();
        }
        while (!t.isEmpty()) {
            s.push(t.top());
            t.pop();
        }
        return sum / counter;
    }

    public static void DeleteLessthan50(LinkedStack<Student> s) {
        LinkedStack<Student> t = new LinkedStack();
        while (!s.isEmpty()) {
            Student item = s.top();
            if (item.getGpa() >= 50) {
                t.push(item);
            }
            s.pop();
        }
        while (!t.isEmpty()) {
            s.push(t.top());
            t.pop();
        }
    }

    public static <T> void print(LinkedStack<T> s) {
        System.out.println("---------------------");
        LinkedStack<T> t = new LinkedStack();
        while (!s.isEmpty()) {
            T item = s.top();
            System.out.println(item);
            t.push(item);
            s.pop();
        }
        while (!t.isEmpty()) {
            s.push(t.top());
            t.pop();
        }
    }
}
