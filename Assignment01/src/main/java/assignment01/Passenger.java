
package assignment01;


public class Passenger implements Comparable<Passenger>  {
    /*Create a public Java class named Passenger that contains the followings: 
•	Two private instance variables: seatNumber of type Integer and name of type String.
•	Public instance methods including constructor; setters; getters; and any other methods
        required for the class to accomplish the next task.

    
    
    */
    private Integer seatNumber ; 
    private String name;

    public Passenger(Integer seatNumber ,String name) {//return to it****
        this.name = name;
        this.seatNumber=seatNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // other methods

    @Override
    public String toString() {
        return "Passenger{" + "seatNumber=" + seatNumber + ", name=" + name + '}';
    }
    @Override
    public boolean equals(Object obj){
//        if(obj instanceof Passenger == false)
//            return false;
//        
//        return ((Passenger)obj).getSeatNumber().equals(seatNumber);
        if(obj == null){
            return false;
        }
        if(obj instanceof Passenger == false){
            return false;
        }
        return seatNumber.equals(((Passenger)obj).getSeatNumber());
    }
    public int compareTo(Passenger o){
//        if(o instanceof Passenger == false){
//            try{
//                throw new Exception("type miss match");
//            }
//            catch(Exception ex){
//                System.out.println(ex.getMessage());
//            }
//        }
        //Passenger obj2=(Passenger)o;
        if(seatNumber.equals(o.getSeatNumber()))
            return 0;
        else if(seatNumber > o.getSeatNumber())
            return +1;
        return -1;
    }
    
    
    
}
