package second;
import java.util.*;
import java.io.*;

/**
 * Created by expert on 7/23/18.
 */
public class ThreadEx2 implements Runnable {

    @Override
    public void run() {


        for (int i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread in execution");
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {

        ThreadEx2 obj=new ThreadEx2();
        Thread t=new Thread(obj);
        t.setName("mythread1");
        t.start();

        Thread t1=new Thread(obj);
        t1.start();
        System.out.println("main thraed");
    }
}
