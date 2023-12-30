package assignment01;

import lists.ArraySortedList;

public class App1 {

    public static void main(String[] args) {
        /*Create an App class to accomplish the following requirements:
•	Create four objects of type Passenger and add them to a passengerList of type ArraySortedList. 
•	Define a generic static method named removeDuplicatePassenger, which takes one parameter:
        passengerList of type ArraySortedList. This method is intended to remove, from the passenger list, 
        redundant passenger objects that have the same seat number (i.e. if there are three passengers with
        the same seat number, you should keep the first one and delete the others). 
        Hint: Passengers must be sorted according to seat numbers.

        
        */
        Passenger p1 = new Passenger(4,"Tasnim"); 
        Passenger p2 = new Passenger(2, "Lujain");
        Passenger p3 = new Passenger(1,"Batool" );
        Passenger p4 = new Passenger(2, "Shahd");
        Passenger p5 = new Passenger(2, "Remas");
        ArraySortedList<Passenger> passengerList = new ArraySortedList();
        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);
        passengerList.add(p4);
        passengerList.add(p5);
        
        System.out.println(passengerList);
        // System.out.println(passengerList.toString());
        //passengerList.reset();//to ensure I am at the beggining of a list
        passengerList = removeDuplicatePassenger(passengerList);
        System.out.println(passengerList);

    }
    /* 
Inside the removeDuplicatePassenger method, you call temp.contains(p) method. 
This method call public boolean 
contains(T element) method, which interns call find(element); 
. This method call if (list[location].equals(target)).
So we have make sure that Passenger have equals method.
 */
    public static <T> ArraySortedList removeDuplicatePassenger(ArraySortedList<Passenger> list) {
        ArraySortedList<Passenger> temp = new ArraySortedList();
        Passenger p;
        while (list.size() != 0) {
            p = list.getNext();
            if (temp.contains(p) == false) {
                temp.add(p);
                
            }
            list.reset();
            list.remove(p);
        }
        return temp;

    }
}
