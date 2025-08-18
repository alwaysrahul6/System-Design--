package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;

public class Restro1 implements RecipeFactory {
    @Override
    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("Veg")) {
            return new VegBurger();
        } else return null;
    }

    @Override
    public ColdDrink createdrink(String type) {
        if (type.equalsIgnoreCase("Sprite")) {
            return new SpriteDrink();
        } else return null;
    }
}
