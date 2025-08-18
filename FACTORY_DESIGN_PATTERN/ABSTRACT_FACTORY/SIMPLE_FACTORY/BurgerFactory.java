package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.SIMPLE_FACTORY;

public class BurgerFactory {

    public Burger getburger(String type){
        if (type.equalsIgnoreCase("basic")){
            return new NormalBurger();
        } else if (type.equalsIgnoreCase("Standard")) {
            return new StandardBurger();
        } else if (type.equalsIgnoreCase("Premium")) {
            return new PremiumBurger();
        }else return null;
    }
}
