package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN.Cofee;

public class milkCofee extends DecoratorCoffee {

    public milkCofee(Cofee cofee){
        super(cofee);
    }

    @Override
    public String decryption() {
        return super.decryption() + " Milk ";
    }

    @Override
    public int getCost() {
        return super.getCost() + 25;
    }
}
