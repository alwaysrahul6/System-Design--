package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.FACTORY_METHOD;

public class KingBurger implements BurgerFactory{
    @Override
    public BURGER getBurger(String type) {
        if (type.equalsIgnoreCase("Basic")){
        return new NormalBurger();
        } else if (type.equalsIgnoreCase("Premium")) {
            return new PremiumBurger();
        } else if (type.equalsIgnoreCase("Standard")) {
            return new StandardBurger();
        }else return null;
    }
}
