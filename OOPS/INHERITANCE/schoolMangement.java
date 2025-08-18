package OOPS.INHERITANCE;

public class schoolMangement {
   static class school{
        String name ;
        int age;
        String email;
        school(String name , int age, String email){
            this.name =name;
            this.age = age;
            this.email = email;
        }
    }
    static class student extends school{
        int rollnumber;
        String grade;

        student(String name, int age, String email,int rollnumber,String grade) {
            super(name, age, email);
            this.rollnumber = rollnumber;
            this.grade = grade;
        }

        ///  behaviour

        public void attendclass(int p){
            if (p == 1) System.out.println("Yes Student attendent");
            else System.out.println("Not present");
        }
    }
    static class teacher extends school{
        int employeeId;
        String Subject;

        teacher(String name, int age, String email,int employeeId,String Subject) {
            super(name, age, email);
            this.employeeId = employeeId;
            this.Subject = Subject;
        }

        public void teach(){
             System.out.println("yes teach");
         }
    }
    static class staff extends school{
        String department;

        staff(String name, int age, String email , String department) {
            super(name, age, email);
            this.department = department;
        }

        public void dowork(){
            System.out.println("yes");
        }
    }

    public  static  void main(String[] args) {
        school a = new student("rahul " , 20, "email", 1, "a");
        System.out.println(a.name);
        staff b = new  staff("raghu" , 20 , "email", "warden");
        System.out.println(b.department);
        teacher c = new teacher("rajan", 20, "rajan@gmail.com", 4 ,"Science" );
        System.out.println(c.Subject);
        System.out.println(c.name);
    }
}