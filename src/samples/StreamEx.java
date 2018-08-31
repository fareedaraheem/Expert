package samples;
import java.util.*;
import java.util.stream.Stream;

/*
 * Created by expert on 8/29/18.
 */
public class StreamEx {

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(3);
        Stream<Integer> s=al.stream();
        s.map(item->item*item).forEach(z->{
            System.out.println(z);
        });

//        s.filter(x-> x>2).forEach(m->{
//            System.out.println(m);
//        });

        ArrayList<String> al1=new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.stream().filter(e->e.contains("t")).forEach(q->{
            System.out.println(q);
        });
    }
}
