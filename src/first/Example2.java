package first;
import java.util.*;
/**
 * Created by expert on 6/28/18.
 */
public class Example2 {
    public void check(int year){
        if(year%4==0)

            System.out.println("It is a leap year");
        else
            System.out.println("Not a leap year");


    }
    public static void main(String[] args) {
        Example2 e= new Example2();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year to check");
        int a=s.nextInt();
        e.check(a);

    }
}
