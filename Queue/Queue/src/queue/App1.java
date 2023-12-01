/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class App1 {
    
    public static <T> void printQueue(ArrayBoundedQueue<T> f){
        ArrayBoundedQueue<T> temp = new ArrayBoundedQueue<>();
        while (!f.isEmpty()){
            T e = f.dequeue();
            System.out.println(e);
            temp.enqueue(e);
        }
        while(!temp.isEmpty())
            f.enqueue(temp.dequeue());        
    }
     
    public static void main(String[] args)
    {
        Scanner conIn = new Scanner(System.in);
        String line;
        
        ArrayBoundedQueue<String> r = new ArrayBoundedQueue<>();
        
        for (int i=1; i<=3;i++)
        {
            System.out.print("Enter a line text : ");
            line= conIn.nextLine();
            r.enqueue(line);           
        }
        printQueue(r);
        
    }
    
}
