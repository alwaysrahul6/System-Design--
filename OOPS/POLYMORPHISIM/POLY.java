package OOPS.POLYMORPHISIM;

public class POLY {
          static class Animal{
              void speak() {

              }
          }
          static class dog extends Animal{
                void speak(){
                    System.out.println("Dog Bark");
                }
            }
            static class cat extends Animal {
              void speak(){
                  System.out.println("Meow");
              }
            }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new dog();
        Animal c = new cat();   
        c.speak();
        b.speak();

    }
}
