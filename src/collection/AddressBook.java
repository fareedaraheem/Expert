package collection;
import java.util.*;

/**
 * Created by expert on 7/17/18.
 */
public class AddressBook {

    int houseno;
    String name;
    int phoneno;

    public AddressBook(int houseno, String name, int phoneno) {
        this.houseno = houseno;
        this.name = name;
        this.phoneno = phoneno;
    }

    public static void delete(int no, HashMap<Integer, AddressBook> hmap) {


        for (Map.Entry<Integer, AddressBook> obj : hmap.entrySet()) {

            if (obj.getKey() == no) {

                hmap.remove(obj.getKey());

                break;

            }
        }
    }

//    public static void update(HashMap<Integer,AddressBook> hmap,int no){
//
//        for(Map.Entry<Integer,AddressBook> obj1=hmap.entrySet()) {
//
//            if(obj1.getKey()==no){
//
//
//            }
//        }
//
//    }
}
