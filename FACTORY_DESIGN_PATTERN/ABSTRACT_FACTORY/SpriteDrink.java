package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;

public class SpriteDrink implements ColdDrink {
    @Override
    public void prepareDrink() {
        System.out.println("Your Sprite");
    }
}
