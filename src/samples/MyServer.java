package samples;
import java.io.*;
import java.net.*;

/**
 * Created by expert on 8/8/18.
 */
public class MyServer {

    public static void main(String[] args) {

        try{

            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();//establishes connection
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("message="+str);
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
