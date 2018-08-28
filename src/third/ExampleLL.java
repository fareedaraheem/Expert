package third;
import java.util.*;

/**
 * Created by expert on 7/12/18.
 */
public class ExampleLL {

    public static void main(String[] args) {

        LinkedList<String> linked=new LinkedList<>();
        linked.add("Sam");
        linked.add("anu");
        linked.addFirst("anju");
        linked.addLast("ann");

        linked.removeLast();
        linked.remove(2);
        linked.remove("anu");
        for(String obj:linked){

            System.out.println(obj);
        }
    }
}
