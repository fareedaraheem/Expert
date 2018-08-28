package collection;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/20/18.
 */
public class RegEx1 {

    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\D]{6}","aaaaaa"));
        System.out.println(Pattern.matches("[@&%]","@"));

        System.out.println(Pattern.matches("[a-z][0-9]{10}","0123456789"));//password

        System.out.println(Pattern.matches("[a-zA-Z0-9@#$%]+[@][a-zA-Z]+[.][c][o][m]","fareeda56@gmail.com"));

        System.out.println(Pattern.matches("[+][9][1][[0-9]+]{10}","+919995805005"));
    }
}
