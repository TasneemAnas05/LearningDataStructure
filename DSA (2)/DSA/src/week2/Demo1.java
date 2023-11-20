package week2;

public class Demo1 {
    public static void main(String[] args) {
        //Student.counter = 10;
        System.out.println("Student.counter = " + Student.getCounter());
        //Student.counter = 0;
        Student a = Student.getNew("Mahmood");
        System.out.println("Student.counter = " + Student.getCounter());
        
        Student b = Student.getNew("Ahmad");
        System.out.println("Student.counter = " + Student.getCounter());
        
        Student c = Student.getNew("kHALEEL");
        System.out.println("Student.counter = " + Student.getCounter());
        
        Student d = Student.getNew("Saad");
        System.out.println("Student.counter = " + Student.getCounter());
        System.out.println("d: " + d);
        
    }
}
