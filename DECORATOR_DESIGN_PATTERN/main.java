package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN;

public class main {
    public static void main(String[] args) {

        Character mario = new Mario();
        System.out.println(mario.getDetail());

        mario = new FireUp(mario);
        System.out.println("After Fire Up " + mario.getDetail());

        mario = new HeightUp(mario);

        System.out.println("After The Height " + mario.getDetail());
    }
}
