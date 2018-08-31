package samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by expert on 8/29/18.
 */
public class Product {

    int pid;
    int price;
    String name;

    public Product(int pid, int price, String name) {
        this.pid = pid;
        this.price = price;
        this.name = name;
    }

    public static void main(String[] args) {

        Product p1=new Product(1,2000,"pen");
        Product p2=new Product(2,200,"pencil");
        ArrayList<Product> al=new ArrayList<>();
        al.add(p1);
        al.add(p2);
        Stream<Product> s=al.stream();
       // ArrayList<String> pl=new ArrayList<>();
        List<String> pname=al.stream().filter(z->z.price>1000).map(z->z.name).collect(Collectors.toList());//.forEach(z->{
           // System.out.println(z.pid+" "+z.price+" "+z.name);
        //});
        System.out.println(pname);
        System.out.println(".........");
        pname.stream().forEach(z-> System.out.println(z));

        }

    }

