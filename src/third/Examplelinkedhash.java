package third;
import java.util.*;
/**
 * Created by expert on 7/12/18.
 */
public class Examplelinkedhash {

    public static void main(String[] args) {

        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("ann");
        set.add("manu");
        set.add("angel");
        set.add("abc");
        set.add("zen");
        set.add("anu");
        set.add("ann");
        System.out.println(set);


        for(String obj:set){

            System.out.println(obj);
        }


        TreeSet<String> tset=new TreeSet<>();
        tset.add("ann");
        tset.add("anu");
        tset.add("aaa");
        for(String obj1:tset){

            System.out.println(obj1);
        }
    }
}
