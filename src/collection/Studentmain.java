package collection;
import java.util.*;

/**
 * Created by expert on 7/17/18.
 */
public class Studentmain {

    public static void main(String[] args) {

     //   HashMap<Integer,String> hmap=new HashMap<>();
//        hmap.put(11,"meenu");
//        hmap.put(2,"anu");
//        hmap.put(23,"ria");
//
//        hmap.remove(2);
//        for(Map.Entry obj:hmap.entrySet()){
//
//            System.out.println("key "+obj.getKey()+" "+"value "+obj.getValue());
//
//        }
//..................................

//        HashMap<Integer,Student> hmap=new HashMap<>();
//        hmap.put(2,new Student("alan",22,"h1001"));
//        hmap.put(3,new Student("anju",20,"h1002"));
//        hmap.put(4,new Student("meenu",19,"h1003"));
//
//        for(Map.Entry<Integer,Student> obj:hmap.entrySet()){
//
//            System.out.println("rollno: "+obj.getKey());
//            System.out.println("Details of student");
//            Student s=obj.getValue();
//            System.out.println(s.name+"  "+s.age+" "+s.address);
//
//        }

        //..............................

//        LinkedHashMap<String,String> obj=new LinkedHashMap<>();
//        obj.put("11","amal");
//        obj.put("22","sam");
//
//        System.out.println(obj.containsKey("11"));
//        for(Map.Entry<String,String>obj1:obj.entrySet()){
//
//            System.out.println(obj1.getValue());
//            System.out.println(obj1.getKey());
//        }

        //...................

        TreeMap<Integer,String> m=new TreeMap<>();
        m.put(20,"zen");
        m.put(3,"alan");
        m.put(1,"ancy");
        for(Map.Entry<Integer,String> obj: m.entrySet()){

            System.out.println(obj.getKey());
        }
    }
}
