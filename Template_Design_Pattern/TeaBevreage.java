package DESIGN_PATTERN.Template_Design_Pattern;

public class TeaBevreage extends Bevrage{

    @Override
    protected void brew() {
        System.out.println("Tea Bevrages");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Milk and Sugar");
    }

    @Override
    protected void ready() {
        System.out.println("Tea is Ready :");
    }

}
