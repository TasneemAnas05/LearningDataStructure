
package lists;


public class App2 {
    public static <T> void deleteAllByValue(ArraySortedList<T> list , T value){
        while(list.remove(value)){}// delete all occurences of this value
    }
    public static <T> void deleteFirstByValue(ArraySortedList<T> list , T value){
        list.remove(value);// delete first occurences of this value
    }
    public static <T> int CountAllByValue(ArraySortedList<T> list , T value){
       int counter=0;
       while(list.getNext().equals(value)){
           counter++;
       }
       return counter;
    }
    
    public static void main(String[] args) {
        ArraySortedList<String>list=new ArraySortedList(3);
        list.add("Tasnim");
        list.add("Lujain");
        list.add("Batool");
        list.add("Shahd");
        System.out.println("***** Print All List Elements *****");
        System.out.println(list);//  System.out.println(list.toString());
        
        ArraySortedList<Student> studentList=new ArraySortedList(3);
        Student st1=new Student(202210741 , "Tasnim" , "CS");
        Student st2=new Student(202210543 , "Lujain" , "CS");
        Student st3=new Student(202210367 , "Batool" , "SE");
        Student st4=new Student(202210889 , "Shahd" , "AI");
        studentList.add(st1);
         studentList.add(st3);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        System.out.println("------------------------------");
        System.out.println(studentList.toString());
        deleteAllByValue(studentList , st3);
        System.out.println("------------------------------");
        System.out.println(studentList);   
        deleteFirstByValue(studentList , st2);
        System.out.println("------------------------------");
        System.out.println(studentList);   


    }
    
}
