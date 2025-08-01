package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN.Cofee;

public abstract class DecoratorCoffee implements Cofee {

    protected Cofee cofee;

    public DecoratorCoffee(Cofee cofee){
        this.cofee = cofee;
    }

    @Override
    public String decryption() {
        return cofee.decryption();
    }

    @Override
    public int getCost() {
        return cofee.getCost();
    }
}
