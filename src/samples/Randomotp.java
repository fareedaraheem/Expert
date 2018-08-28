package samples;

import java.util.Random;

/**
 * Created by expert on 8/13/18.
 */
public class Randomotp {

    //static char[] passwordMethod(int len){
    public static void main(String[] args) {


        System.out.println("Generating password using random()..");
        System.out.println("Your new password is:");

        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";

        String val=caps+small+num;

        Random r=new Random();
        char[] password=new char[10];
        for(int i=0;i<10;i++){
           password[i]= val.charAt(r.nextInt(val.length()));

        }

        System.out.println(password);
    }
}
