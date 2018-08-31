package samples;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expert on 8/30/18.
 */
public class Bytearrayopstream {

    public static void main(String[] args) throws IOException {
        String s="Hello world";
        byte[] b=s.getBytes();
        FileOutputStream fout=new FileOutputStream("bytearrayopstreamfile1.txt");
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(b);
        baos.writeTo(fout);
    }
}
