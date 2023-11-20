package week2;

public class Student {

    public String name;
    private static int counter;

    private Student(String name) {
        this.name = name;
        Student.counter++;       
    }
    
    public static Student getNew(String name){
        if(counter <3)
            return new Student(name);
        else
            return null;
    }

    public static int getCounter() {
        //String s = this.name; //Error you can not access instance variable
        return Student.counter;
    }

    public String getName() {
        //You access both static and non static attribute
        int x = Student.counter;
        return this.name;
    }


    public void PrintInfo() {
        String n = getName();
        int c = getCounter();
        System.out.println("Name: " + n + "(" + c + ")");
    }
}
