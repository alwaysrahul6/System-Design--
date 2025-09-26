package DESIGN_PATTERN.Template_Design_Pattern;

abstract class Bevrage {
    public final void prepareBevrage(){
         boilWater();
         brew();
         pourInCup();
         addCondiments();
         ready();
    }

    private void boilWater(){
        System.out.println("Water is Boiling :");
    }

    private void pourInCup(){
        System.out.println("Pouring In The Cup:");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
    protected abstract void ready();




}
