package week2;

import week3.Contact;

public class Demo2 {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[100];
        Contact c1 = new Contact(1, "Ali");
        Contact c2 = new Contact(1, "Ali");
        System.out.println(c1.equals(c2));
        
        contacts[0] = c1;
        contacts[1] = c2;

    }
}
