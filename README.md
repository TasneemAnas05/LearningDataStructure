Question 1									[39 POINTS]
Write an instance method named slice that will be incorporated into the ArrayUnsortedList class. This method should accept two parameters, F and L, which should be of type integer. The method should return the elements, in a list of type ArrayUnsortedList, between F and L inclusive (i.e. First and Last elements are included). Make sure that F and L are greater than 0 and less than or equal to the number of elements, otherwise return null.

Question 2									[96 POINTS]
A.	[38 Points] Create a public Java class named Passenger that contains the followings: 
•	Two private instance variables: seatNumber of type Integer and name of type String.
•	Public instance methods including constructor; setters; getters; and any other methods required for the class to accomplish the next task.
B.	[58 Points] Create an App class to accomplish the following requirements:
•	Create four objects of type Passenger and add them to a passengerList of type ArraySortedList. 
•	Define a generic static method named removeDuplicatePassenger, which takes one parameter: passengerList of type ArraySortedList. This method is intended to remove, from the passenger list, redundant passenger objects that have the same seat number (i.e. if there are three passengers with the same seat number, you should keep the first one and delete the others). 
Hint: Passengers must be sorted according to seat numbers.

