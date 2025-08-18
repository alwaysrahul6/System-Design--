package TOMATO.factories;

import TOMATO.model.*;
import TOMATO.strategies.Payment;

import java.time.LocalDateTime;
import java.util.List;

public class NowOrder implements OrderFactory{

    private int id;

    private Restaurant restaurant;

    private List<MenuItem> menuItems;

    private User user;

    String orderType;

    private Payment payment;
    public NowOrder(int id , Restaurant restaurant , List<MenuItem>menuItems , User user, Payment payment,String orderType){
        this.id = id;
        this.restaurant = restaurant;
        this.menuItems = menuItems;
        this.user = user;
        this.payment = payment;
        this.orderType = orderType;
    }
    @Override
    public Order createOrder() {
        Order order;
        switch (orderType){

            case "Delivery" -> {
                DeliveryOrder order1 = new DeliveryOrder(id , restaurant , menuItems , user , payment);
                order1.setUserAddress(user.getAddress());
                order1.setTime(LocalDateTime.now());
                order = order1;
            }
            case "Pickup" -> {
                PickUpOrder order1 = new PickUpOrder(id , restaurant , menuItems , user , payment);
                order1.setRestaurantAddress(restaurant.getAddress());
                order1.setTime(LocalDateTime.now());
                order = order1;

            }
            default -> throw new RuntimeException();
        }
        return order;
    }
}
