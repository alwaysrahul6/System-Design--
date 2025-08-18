package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN.Cofee;

public class CapcciunoCofee implements Cofee{
    @Override
    public int getCost() {
        return 75;
    }


    @Override
    public String decryption() {
        return "Cappicino Cofee";
    }
}
