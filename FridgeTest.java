package ua.od.pindus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 27.04.2016.
 */
public class FridgeTest {
    public static void main(String[] args) {
        /*List<String> productsList=new ArrayList<String>();
        productsList.add("pie");
        productsList.add("mango");
        productsList.add("juice");

        String wantedFood="pie";*/

        Fridge myFridge=new Fridge(3, 4, "apple, pie, cake");
        myFridge.LoadProducts("soup, fish, butter, oil, cream, ketchup, juice, water");
        myFridge.grabSomeFood("cake");

        myFridge.PrintInfo();
    }


}
