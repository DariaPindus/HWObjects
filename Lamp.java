package ua.od.pindus;

/**
 * Created by User on 25.04.2016.
 */
/*У него будет название, определенное количество батареек, которые можно вставить,
он должен уметь светить красным, белым светом, а также мигать,
 причем для белого света достаточно одной батарейки, для красного нужно 2, для мигающего нужно 3
 (свойство int battery, которое будет хранить количество батареек для этого подойдет).*/
public class Lamp {
    private String name;
    private int batteries;


    public void SetLamp(String name, int bat){
        this.name=name;
        batteries=bat;
    }

    public void SwitchOnWhite(){
        if (batteries>=1){
            System.out.println("Your magic lamp is now shining white.");
        }
        else
            System.out.println("It's not working, I'm sorry");
    }

    public void SwitchOnRed(){
        if(batteries>=2){
            System.out.println("Your magic lamp is now shining red.");
        }
        else
        {
            System.out.println("Something wrong. Try to add batteries.");
        }
    }

    public void SwitchOnFlashing(){
        if(batteries<3)
            System.out.println("Something wrong. Try to add batteries");
        else
            System.out.println("Your magic lamp is now flashing.");
    }
}
