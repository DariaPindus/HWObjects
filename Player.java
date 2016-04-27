package ua.od.pindus;

/**
 * Created by User on 25.04.2016.
 */
public class Player {
    private boolean radio;
    private boolean cd;
    double[] fm = new double[3];
    private String disk;
    private double currentRadio;

    Player() {
        radio = true;
        cd = false;
    }

    public void TurnTheRadio() {
        radio = true;
        cd = false;
    }

    public void TurnTheRadioStation(int i){
        currentRadio=fm[i];
    }

    public void TurnTheCd() {
        radio = false;
        cd = false;
    }

    public void SetRadioAutomatically() {
        int currentIndex=0;
        for (double i = 89.0; i < 100.0; i ++) {
            for (int j = currentIndex; j < 3; j++) {
                if (i == 89 || i == 93 || i == 95) {
                    fm[currentIndex] = i;
                    currentIndex++;
                    break;
                } else
                    break;
            }
        }
    }

    public void PutDisk(String name){
        if(cd){
            disk=name;
        } else {
            radio = false;
            System.out.println("Radio has been switched off.\n");
            disk = name;
        }
    }

    public void PrintInfo(){
        if(radio){
            System.out.println("You're listening to the "+currentRadio+" radio station\n");
        } else {
            System.out.println("You're listening to the "+disk+" disk\n");
        }
    }
}
