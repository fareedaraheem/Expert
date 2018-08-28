package collection;
import java.util.*;

/**
 * Created by expert on 7/17/18.
 */
public class AddressBookmain {

    public static void main(String[] args) {

        HashMap<Integer,AddressBook> hmap=new HashMap<>();
        hmap.put(101,new AddressBook(1010,"meenu",12345));
        hmap.put(102,new AddressBook(1020,"rukku",1111));
        for(Map.Entry<Integer,AddressBook> obj:hmap.entrySet()){

            System.out.println("House no: "+obj.getKey());
            AddressBook ab=obj.getValue();
            System.out.println("name: "+ab.name+" phoneno: "+ab.phoneno);


        }

        AddressBook.delete(101,hmap);

        for(Map.Entry<Integer,AddressBook> obj:hmap.entrySet()){

            System.out.println("House no: "+obj.getKey());
            AddressBook ab=obj.getValue();
            System.out.println("name: "+ab.name+" phoneno: "+ab.phoneno);


        }



    }
}
