package week3;

public class Contact {

    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) throws Exception {
        if (number >= 1 && number <= 100) {
            this.number = number;
        } else {
            throw new Exception("Number shuold be between 1 & 100");
        }
    }

    public String getName() {
        return "Name: " + name;
    }

    public void setName(String name) throws Exception {
        if (name.length() > 2) {
            this.name = name;
        } else {
            throw new Exception("الإسم يجب أن يحتوي على 3 أحرف على الأقل");
        }
    }

    public Contact(int number, String name) {
        try {
            setName(name);
            setNumber(number);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        //return super.toString();
        //return "("+super.toString()+") \n- " + getName() + " \n- Number: " + getNumber(); 
        return "- " + getName() + " \n- Number: " + getNumber();
    }

    @Override
    public boolean equals(Object obj2) {
        //return super.equals(obj2);
        if (obj2 instanceof Contact) {
            //return super.equals(o);
            if (getNumber() == ((Contact) obj2).getNumber()
                    && getName().equals(((Contact) obj2).getName())) {
                return true;
            }
        }
        return false;
    }

}
