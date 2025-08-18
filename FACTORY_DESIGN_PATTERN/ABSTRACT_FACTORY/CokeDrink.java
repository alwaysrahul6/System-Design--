package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;

public class CokeDrink implements ColdDrink{
    @Override
    public void prepareDrink() {
        System.out.println("Coke Is Here: ");
    }
}
