package samples;

/**
 * Created by expert on 7/23/18.
 */


class Thread1 extends Thread{

    Threadsample s;
    Thread1(Threadsample s){
        this.s=s;
    }

    @Override
    public void run() {
        s.display(50);
    }
}

class Thread2 extends Thread{

    Threadsample s;
    Thread2(Threadsample s){
        this.s=s;
    }
    @Override
    public void run() {
        s.display(100);
    }
}



public class Threadmain {
    public static void main(String[] args) {

        Threadsample obj = new Threadsample();
        Thread1 t = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t.start();
        t2.start();

        Threadsample s=new Threadsample();
        Thread1 t3 = new Thread1(s);
        Thread2 t4 = new Thread2(s);
        t3.start();
        t4.start();

    }
}
