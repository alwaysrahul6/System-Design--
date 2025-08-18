package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.FACTORY_METHOD;

public class SharmaBurger implements BurgerFactory{
    @Override
    public BURGER getBurger(String type) {
        if (type.equalsIgnoreCase("Normal Wheat")){
            return new WheatNormalBurger();
        } else if (type.equalsIgnoreCase("Premium  Wheat")) {
            return new PremiumWheatBurger();
        } else if (type.equalsIgnoreCase("Standard Wheat")) {
            return new StandardWheatBurger();
        }else return null;
    }
}
