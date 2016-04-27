package ua.od.pindus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by User on 25.04.2016.
 */
public class Fridge {
    int occupiedShelves;
    int shelves;
    int freePlaces;
    int amountOfProducts;
    boolean isEmpty;
    //String[] products;
    List productsList=new ArrayList<String>();

    public Fridge() {
        shelves = 4;
        amountOfProducts = 0;
        freePlaces=shelves*4;
    }

    public Fridge(int shelves, int aop, String prod) {
        this.shelves = shelves;
        this.amountOfProducts = aop;
        freePlaces=shelves*4;
        String []products = prod.split(", ");
        for(int i=0;i<products.length;i++)
            productsList.add(products[i]);
    }

    public boolean CheckPlace(int amount) {
        if (amount > freePlaces) {
            System.out.println("There isn't enough space for your products.");
            return false;
        } else
            return true;
    }

    public void PlaceProducts(int amount) {
        if (amount < 4) {
            occupiedShelves = 1;
        }
        occupiedShelves = amount / 4;
        freePlaces = 4 * (shelves - occupiedShelves) - amount % 4;
    }

    public void LoadProducts(String prod) {
        String [] products = prod.split(", ");
        if (CheckPlace(products.length)) {
            PlaceProducts(products.length);
            for(int i=0;i<products.length-1;i++)
                productsList.add(products[i]);
        }
        else
        {
            System.out.println("Isn't able to load products");
        }
    }

    public boolean PassDietCheck() {
        Calendar calendar = Calendar.getInstance();
        int currentHours = calendar.get(Calendar.HOUR_OF_DAY);
        if (currentHours >= 19) {
            System.out.println("A-a, it's too late. Try tomorrow ");
            return false;
        }
        return true;
    }

    public void grabSomeFood(String wantedFood) {
        if (!PassDietCheck())
            return;
        if(!productsList.remove(wantedFood)){
            System.out.println("Probably you've entered unexisted food");
        }
        else
            System.out.println("You've taken "+wantedFood);
    }

    public void PrintInfo(){
        System.out.println("This fridge has "+shelves+" shelves. \n You have "+productsList.size()+" products in your fridge.\nYou have "+freePlaces+" free places here.");
    }
}
