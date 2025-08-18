package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.SIMPLE_FACTORY;

public class main {
    public static void main(String[] args) {
        String type = "Basic";

        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.getburger(type);
        if (burger != null){
            burger.prepare();
        }
    }
}
