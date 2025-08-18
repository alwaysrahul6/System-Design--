package TOMATO.strategies;

public class NetBanking implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment Through Net Banking");
    }
}
