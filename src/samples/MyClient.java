package samples;
import java.io.*;
import java.net.*;


/**
 * Created by expert on 8/8/18.
 */
public class MyClient{

    public static void main(String[] args) {

        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
