package collection;
import java.io.*;
import java.util.*;
/**
 * Created by expert on 7/19/18.
 */
public class File3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("word.txt"));

        ArrayList<String> al = new ArrayList();
        String line = br.readLine();
        String a[] = line.split(" ");
        for (String obj : a) {
            System.out.println(obj);
            al.add(obj);
        }
        for (String obj1 : al) {
            System.out.println(obj1);

        }






    }



    }

