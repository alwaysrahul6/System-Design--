package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;

public class VegBurger implements Burger{
    @Override
    public void prepareBurger() {
        System.out.println("This is A Veg Burger ");
    }
}
