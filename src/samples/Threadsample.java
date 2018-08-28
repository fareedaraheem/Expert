package samples;

/**
 * Created by expert on 7/23/18.
 */
public class Threadsample {

   static synchronized public void display(int x){ //using synchronized will execute only one threadat a time
       // synchronized(this){
            for(int i=0;i<3;i++){
                System.out.println(i*x);
                try{
                    Thread.sleep(1000);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        //}

       System.out.println("Rest of the code"+Thread.currentThread().getName());

    }
}
