package samples;
import java.util.*;
import java.text.*;
import java.time.*;
//import org.joda.time.*;
/**
 * Created by expert on 7/24/18.
 */
public class dateEx {

    public static void main(String[] args) {

        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyy/MM/dd");
        System.out.println(format.format(date));

        LocalDate date1=LocalDate.now();
        System.out.println(date1);

        LocalTime time=LocalTime.now();
        System.out.println(time);

        GregorianCalendar cal=new GregorianCalendar();
        int year=cal.get(GregorianCalendar.YEAR);
        System.out.println(year);
        System.out.println(cal.getTime());

    }

}
