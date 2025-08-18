package TOMATO.strategies;

public class Card implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment Through Card");
    }
}
