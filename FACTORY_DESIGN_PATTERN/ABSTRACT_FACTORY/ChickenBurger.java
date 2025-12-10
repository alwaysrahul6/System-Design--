package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY;
  
public class ChickenBurger implements Burger{
    @Override
    public void prepareBurger() {
        System.out.println("Chicken Burger: ");
    }
}

