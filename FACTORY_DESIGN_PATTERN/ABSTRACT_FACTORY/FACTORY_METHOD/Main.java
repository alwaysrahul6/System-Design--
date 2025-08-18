package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.FACTORY_METHOD;

public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new KingBurger();
        BURGER burger = burgerFactory.getBurger("Basic");
        if (burger != null){
            burger.prepare();
        }
    }
}
