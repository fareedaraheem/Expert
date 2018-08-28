package samples;
import java.util.*;

/**
 * Created by expert on 7/11/18.
 */
public class Parking {

    int type;
    String slotnum;
    int time;

    public Parking(int type, String slotnum, int time) {
        this.type = type;
        this.slotnum = slotnum;
        this.time = time;
    }


    public static void display(ArrayList<Parking>pal){

        for(Parking obj1:pal){
            System.out.println("Slot number: "+obj1.slotnum);
        }

    }
    public static void addVehicle(ArrayList<Parking>pal,Parking obj){

        if(pal.size()<3){

            pal.add(obj);
        }

        else
        {
            System.out.println("All slots are occupied");
        }
    }

    public static void removevehicle(ArrayList<Parking>pal,String slotnum){



        for(Parking obj3:pal){
            if(obj3.slotnum==slotnum){

                int amount=obj3.time*50;
                System.out.println("Amount to be paid: Rs"+amount);

                pal.remove(obj3);

                break;
            }



        }

//        for(Parking obj2:pal){
//            if(obj2.slotnum==slotnum){
//
//                pal.remove(obj2);
//
//                break;
//            }
//
//
//        }








    }


}
