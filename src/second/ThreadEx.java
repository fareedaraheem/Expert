package second;

/**
 * Created by expert on 7/23/18.
 */
public class ThreadEx extends Thread {

    @Override
    public void run() {

        System.out.println("THread in execution");
    }

    public static void main(String[] args) {

        ThreadEx obj=new ThreadEx();
        obj.start();

        ThreadEx t1=new ThreadEx();
        t1.start();
        System.out.println("main thread");

    }
}
