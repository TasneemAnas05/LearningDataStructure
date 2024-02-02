package doublylinkedlist;


public class App2 {

    public static void main(String[] args) {
        DLLNode<Integer> dList = null;

        //No Data
        print(dList);
        printBackward(dList);

        System.out.println("***** Add First *****");
        dList = addFirst(dList, 3);
        dList = addFirst(dList, 8);
        dList = addFirst(dList, 3);
        dList = addFirst(dList, 5);
        dList = addFirst(dList, 2);

        print(dList);
        printBackward(dList);

        dList = null;

        System.out.println("***** Add Last *****");
        dList = addLast(dList, 3);
        dList = addLast(dList, 8);
        dList = addLast(dList, 3);
        dList = addLast(dList, 5);
        dList = addLast(dList, 2);

        print(dList);
        printBackward(dList);

        System.out.println("Size: " + getSize(dList));

        print(dList);
        System.out.println("deleteFirst:");
        dList = deleteFirst(dList);
        print(dList);

        System.out.println("deleteLast:");
        dList = deleteLast(dList);
        print(dList);

        dList = addLast(dList, 3);
        print(dList);

        System.out.println("deleteAllByValue: 3");
        dList = deleteAllByValue(dList, 3);
        print(dList);
         System.out.println("countByValue: 3");
        System.out.println(countByValue(dList, 3));
        print(dList);
         System.out.println("find: 5");
        System.out.println(find(dList,5 ));
        print(dList);
//        
//        System.out.println("deleteAllByValue: 8");
//        dList = deleteAllByValue(dList, 8);
//        print(dList);
//        
//        System.out.println("deleteAllByValue: 5");
//        dList = deleteAllByValue(dList, 5);
//        print(dList);
//        
//        System.out.println("deleteAllByValue: 2");
//        dList = deleteAllByValue(dList, 2);
//        print(dList);
    }

    public static <T> int getSize(DLLNode<T> dList) {
        int counter = 0;
        while (dList != null) {
            counter++;
            dList = dList.getFront();
        }
        return counter;
    }

    public static <T> void print(DLLNode<T> dList) {
        System.out.println("----- Print Forward -----");
        if (dList == null) {
            System.out.println("No Data");
            return;
        }
        while (dList != null) {
            System.out.println(dList.getInfo());
            dList = dList.getFront();
        }
    }

    public static <T> void printBackward(DLLNode<T> dList) {
        System.out.println("----- Print Backward -----");
        if (dList == null) {
            System.out.println("No Data");
            return;
        }
        while (dList.getFront() != null) {
            dList = dList.getFront();
        }
        while (dList != null) {
            System.out.println(dList.getInfo());
            dList = dList.getBack();
        }
    }
     public static void printOddReverseEvevn(DLLNode<Integer> d){
        System.out.println("-----------");
        while(d.getFront() != null){
            Integer v=d.getInfo();
            if(v%2 != 0){
                System.out.println(v);
            }
            d= d.getFront();
        }
        if(d.getInfo()%2 !=0)
            System.out.println(d.getInfo());
        System.out.println("************");
        while(d != null){
             Integer v=d.getInfo();
            if(v%2 == 0){
                System.out.println(v);
            }
            d= d.getBack();
           
        }
    }
    public static <T> DLLNode<T> addFirst(DLLNode<T> dList, T value) {
        DLLNode<T> n = new DLLNode(value);
        if (dList != null) {
            n.setFront(dList);
            dList.setBack(n);
        }
        return n;
    }

    public static <T> DLLNode<T> addLast(DLLNode<T> dList, T value) {
        DLLNode<T> n = new DLLNode(value);
        if (dList == null) {
            return n;
        }
        DLLNode<T> temp = dList;
        while (temp.getFront() != null) {
            temp = temp.getFront();
        }
        n.setBack(temp);
        temp.setFront(n);
        return dList;
    }

    public static <T> DLLNode<T> deleteFirst(DLLNode<T> dList) {
        if (dList == null || dList.getFront() == null) {
            return null;
        }
        dList.getFront().setBack(null);
        return dList.getFront();
    }

    public static <T> DLLNode<T> deleteLast(DLLNode<T> dList) {
        if (dList == null || dList.getFront() == null) {
            return null;
        }
        DLLNode<T> temp = dList;
        while (temp.getFront() != null) {
            temp = temp.getFront();
        }
        temp.getBack().setFront(null);
        return dList;
    }
      public static <T> void deleteMiddle(DLLNode<T>dlist){
        int counter=0;
        while(dlist.getFront() != null){//to return back
            counter++;
            dlist=dlist.getFront();
            
        }
        counter++;//to count the last node 
        if(counter < 3 || counter %2 ==0)
            return;
        int middle=counter/2+1;
        while(dlist != null){
            if(counter-- == middle){
                dlist.getBack().setFront(dlist.getFront());
                dlist.getFront().setBack(dlist.getBack());
            }
            dlist=dlist.getBack();
        }
    }
     public static <T> int countByValue(DLLNode<Integer> dlist , T value){
       int counter=0;
       while(dlist != null){
           if(dlist.getInfo().equals(value))
               counter++;
           dlist=dlist.getFront();
       }
       return counter;
   }
     public static <T> boolean find(DLLNode<T> dlist , T value){
       while(dlist != null){
           if(dlist.getInfo().equals(value))
               return true;
           
               dlist=dlist.getFront();
       }
       return false;
   }
    public static <T> DLLNode<T> deleteAllByValue(DLLNode<T> dList, T value) {
        if (dList == null || (dList.getInfo().equals(value) && dList.getFront() == null)) {
            return null;
        }
        DLLNode<T> temp = dList;
        while (temp != null) {
            if (temp.getInfo().equals(value)) {
                if (temp.getBack() != null) {
                    temp.getBack().setFront(temp.getFront());
                } else {
                    dList = temp.getFront();
                }
                if (temp.getFront() != null) {
                    temp.getFront().setBack(temp.getBack());
                }
            }
            temp = temp.getFront();
        }
        return dList;
    }
      public static <T> void deleteByValue(DLLNode<T> dList, T value) {
       
        DLLNode<T> temp = dList;
        while (temp != null) {
            if (temp.getInfo().equals(value)) {
               
                {  temp.getBack().setFront(temp.getFront());
                  temp.getFront().setBack(temp.getBack());}


      
    }
        
}
           // to add (n) after (w)
        /* n.setFront(w.getFront());
          n.setBack(w);
         w.setFront(n);
         w.getFront().setBack(n);
          
        */

}
