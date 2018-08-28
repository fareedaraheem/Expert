package collection;
import java.io.*;
/**
 * Created by expert on 7/18/18.
 */
public class FileEx2 {

    public static void main(String[] args) throws IOException{

        FileOutputStream fout=new FileOutputStream("one.txt");
        FileWriter fo=new FileWriter("two.txt");
        String s="hello all";
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        FileInputStream fin=new FileInputStream("one.txt");
        int temp=0;
        while((temp=fin.read())!=-1){

            System.out.println((char)temp);
            fo.write((char)temp);
        }



        fo.close();
        FileReader fi=new FileReader("two.txt");
        int ch=0;
        while((ch=fi.read())!=-1){

            System.out.println((char)ch);
        }

    }
}
