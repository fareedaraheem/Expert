package samples;
import java.util.*;

/**
 * Created by expert on 7/11/18.
 */
public class Parkingmain {

    public static void main(String[] args) {

        Parking p1=new Parking(2,"101",2);
        Parking p2=new Parking(2,"102",4);
        Parking p3=new Parking(2,"103",6);
        Parking p4=new Parking(2,"103",5);

        ArrayList<Parking> pal=new ArrayList();
        Parking.addVehicle(pal,p1);
        Parking.addVehicle(pal,p2);
        Parking.addVehicle(pal,p3);
        Parking.addVehicle(pal,p4);

        Parking.display(pal);
        Parking.removevehicle(pal,"101");
        Parking.display(pal);




    }
}
