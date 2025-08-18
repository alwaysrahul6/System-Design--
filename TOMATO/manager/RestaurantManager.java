package TOMATO.manager;

import TOMATO.model.Restaurant;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private volatile static RestaurantManager instance;

    private List<Restaurant>  restaurants ;



    private RestaurantManager(){
        restaurants = new ArrayList<>();
    }

    public static RestaurantManager getInstance(){
        if (instance == null){
           synchronized (RestaurantManager.class){
               if (instance == null){
                   instance = new RestaurantManager();
               }
           }
        }
        return instance;
    }
   // Restaurant Add
    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    // Remove Restaurant

    public void removeRestaurant(Restaurant restaurant){
        restaurants.remove(restaurant);
    }



    /*CRUD OPERATION*/

    public List<Restaurant> SearchLocation(String location){

        List<Restaurant> avilableRestro = new ArrayList<>();
        for (Restaurant res : restaurants ){
            if (res.getAddress().equalsIgnoreCase(location)){
                avilableRestro.add(res);
            }
        }
        return avilableRestro;
    }
}