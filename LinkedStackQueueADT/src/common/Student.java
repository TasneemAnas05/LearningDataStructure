package common;

public class Student implements Comparable<Student> {

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.gpa) ^ (Double.doubleToLongBits(this.gpa) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        boolean isEqualsGpa = this.gpa == other.gpa;
        boolean isEqualsNameLength = this.name.length() == other.name.length();
        return isEqualsGpa && isEqualsNameLength;
    }

    @Override
    public int compareTo(Student other) {
        if (this.equals(other)) {
            return 0;
        }
        if (this.gpa > other.gpa) {
            return 1;
        }
        return -1;
    }

}
