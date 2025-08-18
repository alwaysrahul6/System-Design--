package OOPS.ENCAPSULATION;

public class studentreportcard {
    private String name;
    private int marks;

    /// Name Set
    public void setName(String name) {
        this.name = name;
    }

    /// Marks Set
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    /// Get Name

    public String getName() {
        return name;
    }

    /// get Marks
    public int getMarks() {
        return marks;
    }

    public void print() {
        System.out.println("Name of The student is : " + name);
        System.out.println("Marks of the Student is : " + marks);
    }

    public static void main(String[] args) {
        studentreportcard a = new studentreportcard();
        a.setMarks(100);
        a.setName("rahul");
        a.print();
    }
}


