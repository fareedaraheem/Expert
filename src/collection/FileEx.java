package collection;
import java.io.*;
/**
 * Created by expert on 7/18/18.
 */
public class FileEx {

    public static void main(String[] args) throws IOException {
        FileOutputStream fout= new FileOutputStream("first.txt");
        //fout.write(100);


        String s="java";
        byte[] b=s.getBytes();
        fout.write(b);
        fout.close();

        FileInputStream fin=new FileInputStream("first.txt");
        int temp=0;
        while((temp=fin.read())!=-1){

            System.out.println((char)temp);
        }
        //System.out.println((char)temp);
    }


}
