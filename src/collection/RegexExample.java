package collection;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/19/18.
 */
public class RegexExample {
    public static void main(String[] args) {
        boolean b=Pattern.matches("..b","abb");
        System.out.println(b);

        System.out.println(Pattern.matches("[abc]","aaa"));//a or b or c
        System.out.println(Pattern.matches("[^abc]","z"));
        System.out.println(Pattern.matches("[a-zA-Z]","A"));
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-d[^m-p]]","b"));

    }


}
