package collection;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by expert on 7/20/18.
 */
public class patternmatch {

    public static void main(String[] args) {

        boolean b=false;
        Pattern p=Pattern.compile("java");//string to search
        Matcher m=p.matcher("hi java, hello java");//input string
        while(m.find()){//returns true if string is found

            System.out.println("found"+m.group()+" starting at index "+m.start()+" "+"ending index at"+m.end());
            b=true;

        }
        if(b==false){
            System.out.println("not found");
        }
    }
}
