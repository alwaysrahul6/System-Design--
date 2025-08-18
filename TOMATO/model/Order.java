package TOMATO.model;

import TOMATO.strategies.Payment;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Order {

    protected int id;

    protected Restaurant restaurant;

    protected List<MenuItem> menuItems;

    protected User user;

    protected Payment payment;

    public abstract String getType();

    protected LocalDateTime time;

    public Order(int id , Restaurant restaurant , List<MenuItem>menuItems , User user , Payment payment ){
        this.id = id;
        this.restaurant = restaurant;
        this.menuItems = menuItems;
        this.user = user;
        this.payment = payment;
    }

    public void setTime(LocalDateTime time) {

        this.time = time;
    }
}
