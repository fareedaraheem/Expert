package third;
import java.util.*;
/**
 * Created by expert on 7/12/18.
 */
public class Book {

    String name;
    float price;
    String author;

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args) {

        Book b1=new Book("abc",300f,"Paul");
        Book b2=new Book("xyz",1500f,"Ravi");
        LinkedList<Book> ll=new LinkedList();
        ll.add(b1);
        ll.add(b2);

        for(Book obj:ll){

           if(ll.contains(b1))
           {
               b1.price+=10;
           }
            System.out.println("Name: "+obj.name+" Price: "+obj.price+" Author: "+obj.author);
        }



    }
}
