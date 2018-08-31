package samples;

/**
 * Created by expert on 8/31/18.
 */
public class Genericstudent {

    public <T extends Number> void print(T Mark1,T Mark2){
        double result=Mark1.doubleValue()+Mark2.doubleValue();
        System.out.println("sum="+result);

    }

    public static void main(String[] args) {
        Genericstudent s=new Genericstudent();
        s.print(10,20);
        s.print(10.0f,30.0f);
        s.print(30.00d,40.09d);
    }
}
