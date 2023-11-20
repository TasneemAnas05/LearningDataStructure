
package week3;


public class Demo2 {
   // *******Array of objects(Contac) *********
    public static int  index=-1;
    public static  Contact contacts[];
    public static void main(String[] args) {
        contacts =new Contact[3];
        add(new Contact(1 , "Contact1"));
        add(new Contact(2 , "Contact2"));
        add(new Contact(3 , "Contact3"));
        print();// => toString()
        add(new Contact(4 , "Contact4"));
        print();
        remove();
        remove();
        remove();
        print();
        remove();
        print();
        System.out.println("Size :"+size());
        remove();
        


 
    }
     public static void add(Contact obj){
        if(!isFull())
        contacts[++index]=obj;
    }
    public static boolean isFull(){
        return index==contacts.length-1;
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
            System.out.println(contacts[i]+" ");// toString()
        }
    }
}
