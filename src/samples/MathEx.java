package samples;
import static java.lang.Math.*;
import java.util.*;
import java.io.*;

/**
 * Created by expert on 7/26/18.
 */
public class MathEx {


    public static int getFibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;

        }

        return getFibonacci(n-1)+getFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(abs(-10));
        System.out.println(acos(-1));
        System.out.println(asin(1));
        System.out.println(max(10,12));
        Random random=new Random();
        int i=random.nextInt(10);
        System.out.println(i);

        System.out.println(getFibonacci(5));
    }

}
