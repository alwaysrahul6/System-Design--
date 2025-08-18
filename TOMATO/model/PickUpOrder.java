package TOMATO.model;

import TOMATO.strategies.Payment;

import java.time.LocalDateTime;
import java.util.List;

public class PickUpOrder extends Order{

   private String restaurantAddress;


    public PickUpOrder(int id, Restaurant restaurant, List<MenuItem> menuItems, User user, Payment payment) {
        super(id, restaurant, menuItems, user, payment);
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    @Override
    public String getType() {
        return "Pickup";
    }
}
