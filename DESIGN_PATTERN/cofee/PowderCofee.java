package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN.Cofee;

public class PowderCofee extends DecoratorCoffee{

    public PowderCofee(Cofee cofee){
        super(cofee);
    }

    @Override
    public String decryption() {
        return super.decryption() + " Powder Coffee ";
    }

    @Override
    public int getCost() {
        return super.getCost() +  45;
    }
}
