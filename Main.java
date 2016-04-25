package ua.od.pindus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lamp lamp=new Lamp();
        Scanner sc=new Scanner(System.in);
        String name;
        int batts;
        int param;

        System.out.println("Enter the name of your own lamp:");
        name=sc.nextLine();
        System.out.println("Put the amount of batteries (from 1 to 3)");
        batts=sc.nextInt();
        System.out.println("Chose the wanted parameter: \n 1.White light. \n 2.Red light. \n 3.Flashing light");
        param=sc.nextInt();
        if (!CheckInput(batts, param))
            return;
        lamp.SetLamp(name, batts);
        switch(param){
            case 1: lamp.SwitchOnWhite(); break;
            case 2: lamp.SwitchOnRed(); break;
            case 3: lamp.SwitchOnFlashing(); break;
        }
    }

    public static boolean CheckInput(int bat, int par){
        if(bat<0||bat>4||par<0||par>4) {
            System.out.println("Wrong Enter. Try better.");
            return false;
        }
        else
            return true;
    }
}
