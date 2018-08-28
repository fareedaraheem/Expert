package first;
import java.util.*;

/**
 * Created by expert on 7/10/18.
 */
public class Examp1 {

    public static void main(String[] args) {
              //generic declarations
        ArrayList<String> a1=new ArrayList();
       // List<String> al1=new ArrayList<>();
        //ArrayList<String>al2=new ArrayList<String>();
        a1.add("anu");
        a1.add("anju");
        a1.add("abin");
        a1.add("anu");
        a1.add("null");
        for(String obj: a1){
            System.out.println(obj);
        }

        ArrayList<Integer> a2=new ArrayList();
        a2.add(1);
        a2.add(5);
        a2.add(7);
        for(Integer obj2:a2){
            System.out.println(obj2);
        }

        Iterator itr=a1.iterator();//to iterate
        while(itr.hasNext()){      //next points to the next element
            System.out.println(itr.next());
        }

        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }

        ArrayList<String> a3=new ArrayList();
        a3.add("apple");
        a3.add("orange");
        a3.add("grapes");
        for(String obj: a3){
            System.out.println(obj);
        }

        a1.addAll(2,a3);//merge two arrays at index 2
        a1.remove("anu");
        a1.remove(3);
        for(String obj: a1){
            System.out.println(obj);
        }



    }
}
