package TOMATO.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Double totalPrice;
    private final Restaurant restaurant;
    private final List<MenuItem> items;

    public Cart(Restaurant restaurant) {
        this.totalPrice = 0.0;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
    }

    public void addToCart(MenuItem item){
        if (restaurant== null){
            System.out.println("Select Restaurant First");
            return;
        }else{
            totalPrice+=item.getPrice();
            items.add(item);
        }
    }

    public void removeFromCart(MenuItem item){
        if (restaurant == null){
            System.out.println("Select Restaurant First");
        }else {
            totalPrice -= item.getPrice();
            items.remove(item);
        }
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void clearCart(){
        items.clear();
        totalPrice = 0D;
    }
}
