package DESIGN_PATTERN.Template_Design_Pattern;

public class CoffeeBevreage extends Bevrage{

    @Override
    protected void brew() {
        System.out.println("Coffee Bevrages : ");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Coffe Powder ");
    }

    @Override
    protected void ready() {
        System.out.println("Your Coffe is Ready: ");
    }
}
