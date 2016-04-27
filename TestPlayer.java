package ua.od.pindus;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by User on 25.04.2016.
 */
public class TestPlayer {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int param;
        Player newPlayer=new Player();

        newPlayer.SetRadioAutomatically();
        System.out.println("You have set your radio automatically");
        for (int j = 0; j < 3; j++)
            System.out.print(newPlayer.fm[j]+" ");

        System.out.println("\n Choose what radio station to listen to: ");
        param=sc.nextInt();
        newPlayer.TurnTheRadioStation(param-1);
        newPlayer.PrintInfo();

        System.out.println("Please, try to insert the disk");
        newPlayer.PutDisk("Laskovii Mai");
        newPlayer.PrintInfo();
    }
}
