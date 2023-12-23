
package lists;


public class Student {
    private int universityID;
    private String name;
    private String department;
    private Student element;

    @Override
    public String toString() {
        return " [" +  universityID + "] "+  name + " - " +department;
    }

    public Student(int universityID, String name, String department) {
        this.universityID = universityID;
        this.name = name;
        this.department = department;
    }

   public boolean equals(Object obj){
       if(obj instanceof Student == false)
           return false;
       return ((Student)obj).getDepartment().equals(department);
   }

    public int getUniversityID() {
        return universityID;
    }

    public void setUniversityID(int universityID) {
        this.universityID = universityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student getElement() {
        return element;
    }

    public void setElement(Student element) {
        this.element = element;
    }
   

    
    
}
