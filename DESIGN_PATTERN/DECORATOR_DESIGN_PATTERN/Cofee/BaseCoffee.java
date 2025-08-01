package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN.Cofee;

public class BaseCoffee implements Cofee{

    @Override
    public String decryption() {
        return "Simple Coffee";
    }

    @Override
    public int getCost() {
        return 25;
    }
}
