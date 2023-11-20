
package stack;


public class App3 {
    
    //Print the values of a stack
    public static <T> void print(ArrayBoundedStack<T>s){
         ArrayBoundedStack<T>t=new ArrayBoundedStack();
         while(!s.isEmpty()){
             T item=s.top();
             System.out.println(item);
           //  System.out.println(s.top());
             t.push(item);
             s.pop();
         }
         while(!t.isEmpty()){
             //System.out.println(s.top());
            // System.out.println(s.top());
             s.push(t.top());
             t.pop();
         }
         
    }
    //print the array in a reverse order
    public static <T> void printReverse(ArrayBoundedStack<T> s) {
        System.out.println("----- Begin Print Stack ----");
        ArrayBoundedStack<T> t = new ArrayBoundedStack();
        while (!s.isEmpty()) {
            t.push(s.top());
            s.pop();
        }
        while (!t.isEmpty()) {
            T item = t.top();
            System.out.println(item);
            s.push(item);
            t.pop();
        }

        System.out.println("----- End Print Stack ------");
    }

    //get the size of the stack
    public static<T>int getSize(ArrayBoundedStack<T>s){
        int counter=0;
        ArrayBoundedStack<T>t=new ArrayBoundedStack();
        while(!s.isEmpty()){
            T item=s.top();
            counter++;
            t.push(item);
            s.pop();
        }
        while(!t.isEmpty()){//to return the values to S so it can be seen
            s.push(t.top());
            t.pop();
        }
        return counter;
    }
    //find the sum of the stack element
    public static int sum(ArrayBoundedStack<Integer>s){
        int sum=0;
        ArrayBoundedStack<Integer>t=new ArrayBoundedStack();
        while(!s.isEmpty()){
            int item=s.top();
            sum+=item;
             
       }
        while(!t.isEmpty()){
            s.push(t.top());
            t.pop();
        }
        return sum;
    }
    //find max value(int=> notgeneric)
    public static int getMax(ArrayBoundedStack<Integer>s){
        ArrayBoundedStack<Integer>t=new ArrayBoundedStack();
        int item=s.top();
        int max=item;
        t.push(item);
        s.pop();//for the first value 
        while(!s.isEmpty()){
            item=s.top();
            if(s.top()>max){
            max=item;
            t.push(item);
            s.pop();
           }
            
        }
        while(!t.isEmpty()){
            s.push(t.top());
            t.pop();
        }
       return max; 
    }
    // find the max name (has the max number of characters)
    public static String getMaxName(ArrayBoundedStack<String> s) {
        ArrayBoundedStack<String> t = new ArrayBoundedStack();
        String maxName = s.top();
        int maxChar = maxName.length();
        t.push(maxName);
        s.pop();
        while (!s.isEmpty()) {
            String item = s.top();
            if (item.length() > maxChar) {
                maxName = item;
                maxChar = item.length();
            }
            t.push(s.top());
            s.pop();
        }
        while (!t.isEmpty()) {
            s.push(t.top());
            t.pop();
        }
        return maxName;
    }
    //Delete an item in a stack and return how many items deleted
    public static int Delete(ArrayBoundedStack<Integer>s,int v){
        ArrayBoundedStack<Integer> t=new ArrayBoundedStack();
        int counter=0;
        while(!s.isEmpty()){
            int item=s.top();
            if(item!=v){
                t.push(item);}
            else{
                    counter++;
                    //if I want the first occurence
                    
                    
            }
            s.pop();
            
        }
        while(!t.isEmpty()){
            s.push(t.top());
            t.top();
        }
        return counter;
    }
    //stack in a reverse way
      public static <T> void reverseStack(ArrayBoundedStack<T> s) {
        ArrayBoundedStack<T> t1 = new ArrayBoundedStack();
        ArrayBoundedStack<T> t2 = new ArrayBoundedStack();
        while (!s.isEmpty()) {
            t1.push(s.top());
            s.pop();
        }
        while (!t1.isEmpty()) {
            t2.push(t1.top());
            t1.pop();
        }
        while (!t2.isEmpty()) {
            s.push(t2.top());
            t2.pop();
        }
    }
    public static void main(String[] args) {
        ArrayBoundedStack<Integer>s1=new ArrayBoundedStack();
        s1.push(7);
        s1.push(8);
        s1.push(-3);
        s1.push(0);
       
        ArrayBoundedStack<String>s2=new ArrayBoundedStack();
        s2.push("Tasnim");
        s2.push("Lujain");
        s2.push("Shahd");
        print(s1);
        System.out.println("Size: "+getSize(s1) );
        System.out.println("Sum: "+sum(s1));
    }
}
