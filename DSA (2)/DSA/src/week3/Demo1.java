package week3;

public class Demo1 {
    // *******Array of integers *********
    public static int index=-1;
    
    public static int[]a;
    
    public static void main(String[] args) {
        
      a =new int[3];
      add(5);
      add(17);
      add(3);
      add(10);
      remove();
//      remove();
//      remove();
//      remove();
      System.out.println("Size :"+size());
      print();
    }
    public static void add(int value){
        if(!isFull())
        a[++index]=value;
    }
    public static boolean isFull(){
        return index==a.length-1;
    }
    public static void remove(){
        if(!isEmpty())
         index--;
    }
    public static boolean isEmpty(){
        return index==-1;
    }
    public static int size(){
        return index+1;
    }
    public static void print(){
        for(int i=0 ; i < size() ; i++){
            System.out.print(a[i]+" ");
        }
    }
    
    
}
