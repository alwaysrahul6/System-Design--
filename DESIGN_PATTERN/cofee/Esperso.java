package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN.Cofee;

public class Esperso implements Cofee{
    @Override
    public String decryption() {
        return "Esperso Coffee";
    }

    @Override
    public int getCost() {
        return 87;
    }
}
