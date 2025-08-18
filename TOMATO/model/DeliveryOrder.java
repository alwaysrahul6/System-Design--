package TOMATO.model;

import TOMATO.strategies.Payment;

import java.util.List;

public class DeliveryOrder extends Order {
    public DeliveryOrder(int id, Restaurant restaurant, List<MenuItem> menuItems, User user, Payment payment) {
        super(id, restaurant, menuItems, user, payment);
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    private String userAddress;
    @Override
    public String getType() {
        return "Delivery";
    }

}
