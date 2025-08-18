package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.SIMPLE_FACTORY;

public  class StandardBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Your Standard Burger is Coming Soon Please Some Minutes ");
    }
}
