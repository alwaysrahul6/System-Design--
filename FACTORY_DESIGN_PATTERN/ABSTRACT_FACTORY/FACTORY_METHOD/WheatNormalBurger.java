package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.FACTORY_METHOD;

public class WheatNormalBurger implements BURGER{
    @Override
    public void prepare() {
        System.out.println("Normal Wheat Burger");
    }
}
