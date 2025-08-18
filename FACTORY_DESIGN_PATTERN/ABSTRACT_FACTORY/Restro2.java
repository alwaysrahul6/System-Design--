package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;

public class Restro2 implements RecipeFactory{
    @Override
    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("Chicken")){
            return new ChickenBurger();
        }else return null;
    }

    @Override
    public ColdDrink createdrink(String type) {
        if (type.equalsIgnoreCase("Coke")){
            return new CokeDrink();
        }else return null;
    }
}
