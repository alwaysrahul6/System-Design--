package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.ABSTRACT_FACTORY.SIMPLE_FACTORY;

 class NormalBurger implements Burger{

     @Override
     public void prepare() {
         System.out.println("Your Normal Burger is Coming Soon Please Some Minutes ");
     }
 }
