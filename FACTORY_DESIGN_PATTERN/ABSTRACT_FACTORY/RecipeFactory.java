package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;

public interface RecipeFactory {
    Burger createBurger(String type);
    ColdDrink createdrink(String type);
}
