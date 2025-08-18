package TOMATO.strategies;

public class Upi implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment Through UPI");
    }
}
