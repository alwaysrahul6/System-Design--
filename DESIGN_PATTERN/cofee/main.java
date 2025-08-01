package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN.Cofee;

public class main {

    public static void main(String[] args) {
        Cofee normal  = new CapcciunoCofee();
        System.out.println(normal.decryption());

        normal  = new milkCofee(normal);

        System.out.println(normal.decryption());

        normal = new PowderCofee(normal);

        System.out.println(normal.decryption());

        System.out.println(normal.getCost() + "₹");

        Cofee anotherCofee = new PowderCofee(new milkCofee( new CapcciunoCofee()));
        Cofee  simpel  = new milkCofee(new CapcciunoCofee());
        System.out.println(simpel.decryption());

    }

}
