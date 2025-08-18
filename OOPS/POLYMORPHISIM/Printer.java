package OOPS.POLYMORPHISIM;

public class Printer {
   void print(int n ){
       System.out.println("the number is :" + n);
   }

   void print(String s){
       System.out.println("String is " + s);
   }

   void print(float decimal){
       System.out.println("Decimal is :" + decimal);
   }

    public static void main(String[] args) {
        Printer p  = new Printer();
        p.print("Rahul");
        p.print(2);
        p.print(45.6f);
    }
}
