package samples;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by expert on 8/13/18.
 */
public class MArraylistfile {

    public static void main(String[] args) throws IOException {

        ArrayList<Arraylistfile> li=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
        String str;
        while((str=br.readLine())!=null){
            String x[]=str.split(",");
            li.add(new Arraylistfile(Integer.parseInt(x[0]),x[1], Integer.parseInt(x[2])));

        }

        for(Arraylistfile al :li){
            System.out.println("Id: "+al.id+"Name: "+al.name+"Marks: "+al.marks);

        }
    }
}
