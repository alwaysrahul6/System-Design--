package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.FACTORY_METHOD;

public class StandardWheatBurger implements BURGER {
    @Override
    public void prepare() {
        System.out.println("Standard Wheat Burger");
    }
}
