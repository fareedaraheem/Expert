package collection;
import java.io.*;

/**
 * Created by expert on 7/18/18.
 */
public class FileExamp {

    public static void main(String[] args) throws IOException{

        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("second.txt");
        int ch=0;
        while((ch=fin.read())!=-1){

            System.out.println((char)ch);
        }
    }
}
