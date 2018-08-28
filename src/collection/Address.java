//package Address;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class Address {
//
//    String hname;
//    String psname;
//    int hid;
//
//    public Address(String hname, String psname, int hid) {
//        this.hname = hname;
//        this.psname = psname;
//        this.hid = hid;
//    }
//
//    //delete
//    public static void delete(HashMap<Integer, Address> hmap, Integer no)
//    {
//        for (Map.Entry obj:hmap.entrySet())
//        {
//            if (obj.getKey()==no)
//            {
//                hmap.remove(obj.getKey());
//                break;
//            }
//
//
//        }
//
//    }
//    //update
//    public static void update(HashMap<Integer, Address> hmap,Integer no)
//    {
//        for (Map.Entry obj:hmap.entrySet())
//        {
//            if (obj.getKey()==no)
//            {
//                hmap.put(no,Address(""));
//            }
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//
//        HashMap<Integer,Address> hmap=new HashMap<>();
//
//        hmap.put(123,new Address("A","a1",12301));
//        hmap.put(124, new Address("B", "a2",12401));
//        hmap.put(125, new Address("C","a3",12501));
//
//        Scanner sc=new Scanner(System.in);
//
//        //Delete
//        System.out.println("Enter house number to delete");
//        int n=sc.nextInt();
//        delete(hmap,n);
//
//        //display
//        for (Map.Entry obj:hmap.entrySet())
//        {
//            Address a= (Address) obj.getValue();
//            System.out.println(" House  id "+a.hid+" House name "+a.hname+" Person name "+a.psname);
//        }
//
//
//
//
//    }
//
//
//
//}
