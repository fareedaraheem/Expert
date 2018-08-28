package first;
import java.io.IOException;

/**
 * Created by expert on 7/9/18.
 */
public class throwsEx {

    public static void check() throws IOException{
        throw new IOException();
    }
    public static void callcheck() throws IOException{

        check();
    }

    public static void main(String[] args) {
       try{
           check();
       }
       catch(IOException e){
           System.out.println("checked exception");
       }

    }
}
