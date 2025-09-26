package DESIGN_PATTERN.Template_Design_Pattern;

public class Client {
    public static void main(String[] args) {
       Bevrage tea = new TeaBevreage();
       tea.prepareBevrage();

       System.out.println();
       Bevrage coffee = new CoffeeBevreage();
       coffee.prepareBevrage();
    }
}
