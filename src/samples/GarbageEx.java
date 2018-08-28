package samples;

/**
 * Created by expert on 7/24/18.
 */
public class GarbageEx {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("before garbage colection");
    }

    int x;

    public static void main(String[] args) {


       // System.gc();
        GarbageEx g=new GarbageEx();

        g=null;
        GarbageEx g1=new GarbageEx();

        g1=null;
        System.gc();
    }
}
