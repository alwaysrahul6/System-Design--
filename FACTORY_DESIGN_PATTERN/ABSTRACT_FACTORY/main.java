package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;

public class main {
    public static void main(String[] args) {

        RecipeFactory recipeFactory = new Restro2();
        Burger burger = recipeFactory.createBurger("Chicken");
        ColdDrink coldDrink = recipeFactory.createdrink("Coke");

        if (burger != null){
            burger.prepareBurger();
        }
        if (coldDrink != null){
            coldDrink.prepareDrink();
        }

        RecipeFactory recipeFactory1 = new Restro1();
        Burger  burgerr = recipeFactory1.createBurger("Veg");
        ColdDrink coldDrinkk = recipeFactory1.createdrink("Sprite");

        if (burgerr != null){
            burgerr.prepareBurger();
        }
        if (coldDrinkk != null){
            coldDrinkk.prepareDrink();
        }

    }
}
